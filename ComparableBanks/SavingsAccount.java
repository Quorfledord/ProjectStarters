/**
 * Write a description of class SavingsAccount here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SavingsAccount extends BankAccount
{
    private double rate;
    
    public SavingsAccount( String name, double deposit, double r )
    {
        super( name, deposit );
        this.rate = r;
    }
    
    public void computeInterest()
    {
        double interest = rate*getBalance();
        
        this.deposit( interest );
    }
}

