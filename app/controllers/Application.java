package controllers;

import com.github.jknack.handlebars.Handlebars;
import com.github.jknack.handlebars.Template;
import play.*;
import play.mvc.*;

import play.twirl.api.Html;
import views.html.*;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Application extends Controller {

    public static Result index() throws Exception {

        final Handlebars handlebars = new Handlebars();
        final String content = loadResource("io/sphere/sunrise/defaulttemplate/layout.hbs");
        final Template template = handlebars.compileInline(content);
        final String rendered = template.apply("Handlebars.java");
        return ok(Html.apply(rendered));
    }

    private static String loadResource(final String resourcePath) throws IOException, URISyntaxException {
        return new String(Files.readAllBytes(Paths.get("/home/michael/dev/template-poc/app/assets/" + resourcePath)));//TODO use classpath
    }

    /*
    final Template template = handlebars.compileInline("Hello {{this}}!");



     */
}
