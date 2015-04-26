package controllers;

import akka.actor.*;
import play.Logger;
import play.mvc.Controller;
import play.mvc.WebSocket;

import java.io.IOException;
import java.nio.file.*;
import java.util.List;
import java.util.concurrent.ForkJoinPool;

public class ReloadController extends Controller {

    public static WebSocket<String> socket() {
        return WebSocket.withActor(ReloadActor::props);
    }

    private static class ReloadActor extends UntypedActor {
        private final ActorRef out;
        private WatchService watchService;
        private volatile boolean isAlive = true;

        public ReloadActor(final ActorRef out) {
            this.out = out;
            final Path folder = Paths.get(System.getProperty("user.dir") + "/app/assets/io/sphere/sunrise/defaulttemplate");
            try {
                watchService = FileSystems.getDefault().newWatchService();
                folder.register(watchService, StandardWatchEventKinds.ENTRY_CREATE, StandardWatchEventKinds.ENTRY_MODIFY, StandardWatchEventKinds.ENTRY_DELETE);
                ForkJoinPool.commonPool().execute(() -> {
                    while (isAlive) {
                        try {
                            final WatchKey take;
                            take = watchService.take();
                            final List<WatchEvent<?>> watchEvents = take.pollEvents();
                            out.tell("reload", self());
                        } catch (final Exception e) {
                            if (isAlive) {
                                shutdown();
                            }
                        }
                    }
                });
            } catch (final IOException e) {
                Logger.error("IO problem", e);
                shutdown();
            }
        }

        private void shutdown() {
            self().tell(PoisonPill.getInstance(), self());
        }

        public static Props props(final ActorRef out) {
            return Props.create(ReloadActor.class, out);
        }

        public void onReceive(final Object message) throws Exception {


        }

        @Override
        public void postStop() throws Exception {
            isAlive = false;
            super.postStop();
            if (watchService != null) {
                watchService.close();
            }
        }
    }
}
