
/*** Worker is a superclass of HourlyWorker and Salaried Worker */
public class Worker 
{
   private String name;
   private double rate;  // a workers hourly rate of pay
   
   public Worker(String n, double r)  
   {
      name = n;
      rate = r;
   }

   public double getRate() { return rate; }

   public final String getName() { return name; }

   public double computePay(int hours) { return rate * hours;  }    
   
   public String toString()
   {
       return "Name = " + name + ", Pay rate = " + rate;
   }
}

