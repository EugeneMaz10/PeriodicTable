package Table;
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
     
        // do this
        get("/elements", (req, res) ->
    {
        Map<String, Object> model = new HashMap<>();
        model.put("message", "Hello Velocity");

        // The  vm file is located under the resources directory
        return new ModelAndView(model,"elements.vm");
     },new VelocityTemplateEngine());

     
    
}
}

   
