import java.util.*;
/**
 * Write a description of class Tester here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tester
{
    // This main method contains example code of creating a PolyXY object (aka a polynomial of x and y)
    // from extracting information from a String, given the restrictions below.
    public static void main(String[] args)
    {
        PolyXY pol = new PolyXY();

        // Restrictions on input String:  No whitespaces, no parentheses, no division, must use
        //                                a "*" for implied multiplication, must use a "^" to 
        //                                designate powers of x and y.
        
        String ss = "-5*x^2*y^1+6*y^1-9-8*x^1*y^1"; // This is an example of a valid String.
        
        // The algorithm that is being used requires replacing all "-" with "+-", so we guarantee that
        // each individual term in the polynomial will be seperated from other terms with a "+".
        ss = ss.replace( "-", "+-" );
        
        // Use a scanner to parse through the polynomial String, using "+" as a delimiter.
        // Note:  Using a scanner in this way does not allow us to know how many terms there are
        //        in the polynomial.(We don't have to use a Scanner, there are other ways to parse Strings...)
        Scanner sc = new Scanner( ss );
        sc.useDelimiter("\\+");

        while( sc.hasNext() )
        {
            String term = sc.next(); // We will deal with each term, one at a time.
            
            // Note:  The content of the variable term should be in the form: A*x^B*y^C
            // Use the split method to parse through the values of the term, using "*" to seperate parts.
            // We will extract the values of A, B, and C from the term.
            String[] subTerms = term.split("\\*");
            double a = 0;
            double b = 0;
            double c = 0;
            String s = "";

            // The following if/else chain goes through all possible combinations of how each term
            // could be given, with the previous stated restrictions on the String.
            if( subTerms.length == 1 )
            {
                if( !subTerms[0].contains("x") && !subTerms[0].contains("y") ) // The term is "A"
                {
                    a = Double.parseDouble( subTerms[0] );
                    b = 0;
                    c = 0;
                }
                else if( subTerms[0].contains("x") && !subTerms[0].contains("y")
                && subTerms[0].substring(0,1).equals("x") )  // The term is "x^B"
                {
                    a = 1;
                    s = subTerms[0];
                    s = s.substring(2);
                    b = Double.parseDouble( s );
                    c = 0;
                }
                else if( subTerms[0].contains("y") && !subTerms[0].contains("x")
                && subTerms[0].substring(0,1).equals("y") ) // The term is "y^B"
                {
                    a = 1;
                    s = subTerms[0];
                    s = s.substring(2);
                    c = Double.parseDouble( s );
                    b = 0;
                }
            }
            else if (subTerms.length == 2 )
            {

                if( !subTerms[0].contains("y") && !subTerms[1].contains("y") && !subTerms[0].contains("x") 
                && subTerms[1].contains("x") ) // The term is "A*x^B"
                {
                    a = Double.parseDouble( subTerms[0] );
                    
                    s = subTerms[1];
                    s = s.substring(2);
                    b = Double.parseDouble( s );
                    
                    c = 0;
                }
                else if( !subTerms[0].contains("x") && !subTerms[1].contains("x") && !subTerms[0].contains("y") 
                && subTerms[1].contains("y") ) // The term is "A*y^C"
                {
                    a = Double.parseDouble( subTerms[0] );
                    
                    b = 0;
                    
                    s = subTerms[1];
                    s = s.substring(2);
                    c = Double.parseDouble( s );
                }
                else if ( subTerms[0].contains("x") && subTerms[1].contains("y") ) // The term is "x^B*y^C"
                {
                    a = 1;

                    s = subTerms[0];
                    s = s.substring(2);
                    b = Double.parseDouble( s );

                    s = subTerms[1];
                    s = s.substring(2);
                    c = Double.parseDouble( s );
                }
            }
            else if (subTerms.length == 3 ) // The term is "A*x^B*y^C"
            {
                a = Double.parseDouble( subTerms[0] );

                s = subTerms[1];
                s = s.substring(2);
                b = Double.parseDouble( s );

                s = subTerms[2];
                s = s.substring(2);
                c = Double.parseDouble( s );
            }
            else // The term is 0, or had an input error
            {
                a = 0;
                b = 0;
                c = 0;
            }
            
            // Now that we have extracted the constants, add the term with those constants to our polyXY object:
            pol.addTerm( a, b, c );     
        }
        
        // Testing
        System.out.println(pol);
        
        // Test values from our polynomial:
        
        System.out.println(pol.getValue(2, 2)); // -69
        System.out.println(pol.getValue(0, 0)); // -9
        System.out.println(pol.getValue(-1, 2)); // 9

    }
}
