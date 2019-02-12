import java.util.*;
/**
 * Write a description of class PolyXY here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PolyXY
{
    private ArrayList<PolyTerm> poly;
    
    public PolyXY()
    {
        poly = new ArrayList<PolyTerm>();
    }
    
    public void addTerm( double a, double b, double c )
    {
        PolyTerm p = new PolyTerm( a, b, c );
        poly.add(p);
    }
    
    public String toString()
    {
        String s = "";
        int track = 1;
        for( PolyTerm p : poly )
        {
            if( track < poly.size() )
                s += p.getA() + "*(x)^" + p.getB() + "*(y)^" + p.getC() + " + ";
            else
                s += p.getA() + "*(x)^" + p.getB() + "*(y)^" + p.getC();
            
            track++;
        }

        return s;
    }
    
    public double getValue( double x, double y )
    {
        double d = 0;
        
        for( PolyTerm p : poly )
        {
            d += p.calcVal( x, y );
        }
        
        return d;
    }
    
    
}
