package Elements;

import org.apache.log4j.BasicConfigurator;

import static spark.Spark.*;


public class Hydrogen 
{
    public static void main(String[] args)
    {
        BasicConfigurator.configure();
        get("/Hydrogen", (req, res) -> "H");
    }
}