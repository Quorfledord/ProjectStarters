
/**
 * HourlyWorker is a subclass of Worker 
 * An HourlyWorker is identical to Worker except
 * they get paid 1.5 times pay rate for hours over 40.
 */
public class HourlyWorker extends Worker
{
   public HourlyWorker(String n, double r)
   {
      super(n, r);
   }
   
   /*** overrides computePay in Worker class */
   public double computePay(int hours)
   {
      if (hours > 40)  {
         return (getRate() * 40) + 
                (getRate() * 1.5 * hours-40);
      }
      return super.computePay(hours);
   }
}

