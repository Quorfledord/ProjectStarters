
/**
 * Write a description of class WorkerTester here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WorkerTester
{
   public static void main(String[] args)
   {
      Worker w1 = new Worker("Warren", 10); 
      System.out.println("\n" + w1);
      System.out.println("Pay = " + w1.computePay(50));
   
      Worker h1 = new HourlyWorker("Howie", 10);
      System.out.println("\n" + h1);
      System.out.println("Pay = " + h1.computePay(50));  
      
      SalariedWorker s1 = new SalariedWorker("Sally", 25);
      s1.takeSickDay();
      System.out.println("\n" + s1);
      System.out.println("Pay = " + s1.computePay(50));
   }
}
