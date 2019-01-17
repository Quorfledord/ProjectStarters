/*** SalariedWorker is a subclass of Worker 
 * --> instance variables and methods are inherited 
 * (except for constructors)
 * --> new methods and variables can be added 
 * --> methods can be overridden
 */
public class SalariedWorker extends Worker
{
   private int sickDays; // new instance variable added

   /*** note that constructors are not inherited ***/
   public SalariedWorker(String n, double r)
   {
      // calls the superclass constructor (must be first line)
      super(n, r); 
      sickDays = 10;
   }
 
   /*** They get paid for 40 hours no matter what! ***/
   /*** They get extra sick day for hours over 50. ***/
   public double computePay(int hours)
   {
       if (hours >= 50) sickDays++;
       return super.computePay(40);
   }
   
   public void takeSickDay() { sickDays--; }
     
   /*** override the toString method and add sick day info ***/
   public String toString()
   {
       return super.toString() + ", Sick Days Remaining: " + sickDays;
   }
}

