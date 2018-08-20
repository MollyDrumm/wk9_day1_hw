import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;


import static spark.Spark.get;
import static spark.Spark.modelAndView;
import static spark.route.HttpMethod.get;

public class Controller {

    VelocityTemplateEngine velocityTemplateEngine = new VelocityTemplateEngine();


    public static void main(String[] args) {

        VelocityTemplateEngine velocityTemplateEngine = new VelocityTemplateEngine();

        get("/random", (req, res) -> {
            return "hello world";
        });

        get("/pair", (req, res) -> {

            return "hello world";
        });
    }

}
