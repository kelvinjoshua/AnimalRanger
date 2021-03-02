
import spark.ModelAndView;
import java.util.ArrayList;
import java.util.HashMap;
import spark.template.handlebars.HandlebarsTemplateEngine;
import java.util.List;
import java.util.Map;
import static spark.Spark.*;
//import static spark.Spark.staticFileLocation;
//import static spark.route.HttpMethod.get;

public class App{
    public static void main(String[]  args) {
        staticFileLocation("/public");
        get("/", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            return new ModelAndView(model, "index.hbs");
        }, new HandlebarsTemplateEngine());

    }

}

