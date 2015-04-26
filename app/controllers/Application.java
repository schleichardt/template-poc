package controllers;

import com.github.jknack.handlebars.Context;
import com.github.jknack.handlebars.Handlebars;
import com.github.jknack.handlebars.Template;
import com.github.jknack.handlebars.io.FileTemplateLoader;
import com.github.jknack.handlebars.io.TemplateLoader;
import com.github.jknack.handlebars.io.TemplateSource;
import com.github.jknack.handlebars.JsonNodeValueResolver;
import play.mvc.*;

import play.twirl.api.Html;

import java.io.File;
import java.io.IOException;

public class Application extends Controller {

    public static final String DEFAULT_TEMPLATE_PATH = "/home/michael/dev/template-poc/app/assets/io/sphere/sunrise/defaulttemplate";
    public static final String O_TEMPLATE_PATH = "/home/michael/dev/template-poc/app/assets/io/sphere/sunrise/alternativeTemplate";

    /**
     * Shows template inheritance, custom blocks can be overridden.
     * @return
     * @throws Exception
     */
    public static Result index() throws Exception {
        final Template template = defaultTemplatesHandlebars().compile("home");
        Context context = Context
                .newBuilder(Data.products())
                .resolver(JsonNodeValueResolver.INSTANCE)
                .build();
        final String rendered = template.apply(context);
        return ok(Html.apply(rendered));
    }

    /**
     * shows how to exchange the page specific template.
     * @return
     * @throws Exception
     */
    public static Result otherPage() throws Exception {
        final Template template = defaultTemplatesHandlebars().compile("otherPage");
        final String rendered = template.apply("Handlebars.java");
        return ok(Html.apply(rendered));
    }

    /**
     * shows how to override some templates, works with page templates as well as with layout templates
     * @return
     * @throws Exception
     */
    public static Result overriddenPage() throws Exception {
        final TemplateLoader loader = AltTemplateLoader.of();
        final Template template =  new Handlebars(loader).compile("home");
        final String rendered = template.apply("Handlebars.java");
        return ok(Html.apply(rendered));
    }

    private static Handlebars defaultTemplatesHandlebars() {
        final TemplateLoader loader = new FileTemplateLoader(DEFAULT_TEMPLATE_PATH);
        return new Handlebars(loader);
    }

    private static class AltTemplateLoader implements TemplateLoader {
        final TemplateLoader defaultLoader;
        final TemplateLoader overrideLoader;

        private AltTemplateLoader(final TemplateLoader defaultLoader, final TemplateLoader overrideLoader) {
            this.defaultLoader = defaultLoader;
            this.overrideLoader = overrideLoader;
        }

        public static TemplateLoader of() {
            final TemplateLoader defaultLoader = new FileTemplateLoader(DEFAULT_TEMPLATE_PATH);
            final TemplateLoader overrideLoader = new FileTemplateLoader(O_TEMPLATE_PATH);
            return new AltTemplateLoader(defaultLoader, overrideLoader);
        }

        @Override
        public TemplateSource sourceAt(final String s) throws IOException {
            return loaderFor(s).sourceAt(s);
        }

        @Override
        public String resolve(final String s) {
            return loaderFor(s).resolve(s);
        }

        @Override
        public String getPrefix() {
            return defaultLoader.getPrefix();
        }

        @Override
        public String getSuffix() {
            return defaultLoader.getSuffix();
        }

        @Override
        public void setPrefix(final String s) {
            defaultLoader.setPrefix(s);
            overrideLoader.setPrefix(s);
        }

        @Override
        public void setSuffix(final String s) {
            defaultLoader.setSuffix(s);
            overrideLoader.setSuffix(s);
        }

        private TemplateLoader loaderFor(final String s) {
            final File file = new File(overrideLoader.getPrefix() + s + overrideLoader.getSuffix());
            return file.exists() ? overrideLoader : defaultLoader;
        }
    }

    /*
    TODO
      show override of a page template
      show override of layout with different controller action
      show how to run design for designer
      load json data into it
      https://github.com/Amadeus82/sbt-handlebars
      websocket reloader/file watcher
        javascript reverse routing?
    may use nashorn to dependen only on handlebars.js

    async hooks, to put more data into json for templates, Sunrise plugins
     */
}
