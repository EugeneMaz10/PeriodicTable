package Class.Elements;

import org.apache.log4j.BasicConfigurator;

import static spark.Spark.*;

//BLue
interface NonMetals 
{
    public void description(); // interface method (does not have a body)
    public void reaction(); // interface method (does not have a body)
    
}




public class Hydrogen implements NonMetals
{
    public void description()
    {
    //  H is a gas non metal() is provided here
    System.out.println("NonMetal");
    }

    
    public static void main(String[] args)
    {
        BasicConfigurator.configure();
        get("/Hydrogen", (req, res) -> "H is a Non-Metal Gas");
    }


    @Override
    public void reaction() {
        // TODO Auto-generated method stub
        
    }

}