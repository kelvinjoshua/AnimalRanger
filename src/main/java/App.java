
import Models.Sightings;
import spark.ModelAndView;
import java.util.ArrayList;
import java.util.HashMap;
import spark.template.handlebars.HandlebarsTemplateEngine;
import java.util.List;
import java.util.Map;
import static spark.Spark.*;
import static spark.debug.DebugScreen.enableDebugScreen;
//import static spark.Spark.staticFileLocation;
//import static spark.route.HttpMethod.get;

public class App{
    public static void main(String[]  args) {
        enableDebugScreen();
        staticFileLocation("/public");
        get("/", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            return new ModelAndView(model, "index.hbs");
        }, new HandlebarsTemplateEngine());

        get("/sightings-form", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            return new ModelAndView(model, "sightings.hbs");
        }, new HandlebarsTemplateEngine());

        get("/animals-form", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            return new ModelAndView(model, "animals.hbs");
        }, new HandlebarsTemplateEngine());

        get("/sightingsDisplay", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            List<Sightings>  sightings = Sightings.getAll();
            model.put("sightings", sightings);
            return new ModelAndView(model, "displaySighting.hbs");
        }, new HandlebarsTemplateEngine());


        post("/sightings", (request, response) -> {
            Map<String, Object> model = new HashMap<>();
            String ranger = request.queryParams("ranger");
            String location = request.queryParams("location");
            int animalId = Integer.parseInt(request.queryParams("animalId"));
            model.put("ranger", ranger);
           model.put("location", location);
            model.put("animalId", animalId);
           Sightings sighting = new Sightings(ranger,location,animalId);
           sighting.save();
            return new ModelAndView(model, "displaySighting.hbs");
        }, new HandlebarsTemplateEngine());


       get("/sightings", (request, response) -> {
            Map<String, Object> model = new HashMap<>();
            String ranger = request.queryParams("ranger");
            String location = request.queryParams("location");
            int animalId = Integer.parseInt(request.queryParams("animalId"));
            Sightings first = new Sightings(ranger,location,animalId);
            first.save();
            return null;
        }, new HandlebarsTemplateEngine());


            /*show animal details*/

        post("/Animals", (request, response) -> {
            Map<String, Object> model = new HashMap<>();
            String name = request.queryParams("name");
            String type = request.queryParams("type");
            String health = request.queryParams("health");
            String age = request.queryParams("age");
            model.put("name", name);
            model.put("type", type);
            model.put("health", health);
            model.put("age",age);
            return new ModelAndView(model, "displayAnimals.hbs");

        }, new HandlebarsTemplateEngine());

        get("/sightingsdisplay", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            List<Sightings>  sightings = Sightings.getAll();
            model.put("sightings", sightings);
            return new ModelAndView(model, "displayAll.hbs");
        }, new HandlebarsTemplateEngine());

                /*
        get("/sightings", (request, response) -> {
            Map<String, Object> model = new HashMap<>();
            String ranger = request.queryParams("ranger");
            String location = request.queryParams("location");
            int animalId = Integer.parseInt(request.queryParams("animalId"));
            Sightings sightings = new Sightings(ranger,location,animalId );
            sightings.save();
            return new ModelAndView(model, "displaySighting.hbs");
        }, new HandlebarsTemplateEngine());
            */



    }

}

/*
  get("/sightingsDisplay", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            List<Sightings>  sightings = Sightings.getAll();
            model.put("sightings", sightings);
            return new ModelAndView(model, "displaySighting.hbs");
        }, new HandlebarsTemplateEngine());

        post("/sightings", (request, response) -> {
            Map<String, Object> model = new HashMap<>();
            String ranger = request.queryParams("ranger");
            String location = request.queryParams("location");
            int animalId = Integer.parseInt(request.queryParams("animalId"));

            model.put("ranger", ranger);
            model.put("location", location);
           model.put("animalId", animalId);
            return new ModelAndView(model, "displaySighting.hbs");
        }, new HandlebarsTemplateEngine());


        get("/sightingsDisplay", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            List<Sightings>  sightings = Sightings.getAll();
            model.put("sightings", sightings);
            return new ModelAndView(model, "allSightingsDisplay.hbs");
        }, new HandlebarsTemplateEngine());
 */