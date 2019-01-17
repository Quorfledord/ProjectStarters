
/**
 * Write a description of class Food here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Food
{
    boolean dessert;
    
    public Food(boolean d)
    {
        dessert = d; 
    }
 
    public String toString()
    { 
        String des = "";
        if(!dessert)
        {
            des = " Not";
        }
        return "I am Food! " +
        "I am" + des + " dessert.";
    }
}

