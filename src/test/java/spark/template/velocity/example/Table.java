package spark.template.velocity.example;
import org.apache.log4j.BasicConfigurator;
import static spark.Spark.*;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;

import java.util.HashMap;
import java.util.Map;

public class Table
{
    public static void main(String[] args)
    {
        BasicConfigurator.configure();        
        port(getHerokuAssignedPort());

     
        // do this
        get("/elements", (req, res) ->
    {
        Map<String, Object> model = new HashMap<>();
        model.put("message", "Periodic Table");
        model.put("H","H");

       

        // The  vm file is located under the resources directory
        return new ModelAndView(model,"elements.vm");
     },new VelocityTemplateEngine());

     
    
}
static int getHerokuAssignedPort() {
    ProcessBuilder processBuilder = new ProcessBuilder();
    if (processBuilder.environment().get("PORT") != null) {
        return Integer.parseInt(processBuilder.environment().get("PORT"));
    }
    return 4567; //return default port if heroku-port isn't set (i.e. on localhost)
}
}

   
