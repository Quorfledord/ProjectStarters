
/**
 * Write a description of class IceCream here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class IceCream extends Food {
    String flavor;  

    public IceCream() 
    {
        super(true);
        flavor = "vanilla"; // default flavor
    }

    public IceCream(String f) 
    {
        super(true);
        flavor = f;  
    }

    public void setFlavor(String f)  
    {
        flavor = f;
    }   

    public String getFlavor()  
    {
        return flavor;
    }       
}

