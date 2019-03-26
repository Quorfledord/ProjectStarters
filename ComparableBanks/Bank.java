import java.util.ArrayList;
/**
 * Write a description of class Bank here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bank
{
    private String bankName;
    private int numEmployees;
    private ArrayList<BankAccount> accounts;
    
    public Bank( String name, int emp )
    {
        bankName = name;
        numEmployees = emp;
        accounts = new ArrayList<BankAccount>();
    }
    
    public String getName()
    {
        return bankName;
    }
    
    public int getNumberOfEmployees()
    {
        return numEmployees;
    }
    
    public ArrayList<BankAccount> getAccounts()
    {
        return accounts;
    }
    
    public void addAccount( BankAccount b )
    {
        accounts.add(b);
    }
    
    public String toString()
    {
        String s = "";
        
        s += "BankName=" + bankName + "\n";
        s += "NumberofEmployees=" + numEmployees + "\n";
        
        // for each bank account in my bank, let's do stuff:
        for( BankAccount b : accounts )
        {
            if( b instanceof SavingsAccount )
            {
                s += "SavingsAccount=" + b.getName() + "\n";
                s += "AccountNumber=" + b.getAccountNumber() + "\n";
                s += "Balance=" + b.getBalance() + "\n";
                s += "Rate=" + ((SavingsAccount)b).getRate() + "\n";
            }
            else
            {
                s += "BankAccount=" + b.getName() + "\n";
                s += "AccountNumber=" + b.getAccountNumber() + "\n";
                s += "Balance=" + b.getBalance() + "\n";
            }
        }
        
        s = s.trim();
        return s;
    }
    
}
