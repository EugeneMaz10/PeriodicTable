package Elements;

import org.apache.log4j.BasicConfigurator;

import spark.template.velocity.example.Table.Table;

import static spark.Spark.*;


public class Hydrogen extends Table
{
    public static void main(String[] args)
    {
        BasicConfigurator.configure();
        get("/Hydrogen", (req, res) -> "H");
    }
}