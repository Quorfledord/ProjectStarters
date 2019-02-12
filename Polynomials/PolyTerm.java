
/**
 * Write a description of class PolyTerm here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PolyTerm
{
    private double a, b, c;
    
    public PolyTerm( double aa, double bb, double cc )
    {
        a = aa;
        b = bb;
        c = cc;
    }
    
    public double calcVal( double x, double y )
    {
        return a*Math.pow(x,b)*Math.pow(y,c);
    }
    
    public double getA()
    {
        return a;
    }
    
    public double getB()
    {
        return b;
    }
    
    public double getC()
    {
        return c;
    }
}
