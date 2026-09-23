/*
 Create one Bank class which will have accHolderName, AccNumber, balance, accStatus
 if accHolder and accNumber is valid and if balance is grate then 10000 then only the accStatus should be active 
 else you will apply bounce charges
 */

package Introduction;

class Account
{
	private String AccHolderName;    
	private String AccNumber;    
	private double Balance;    
	private String AccStatus;
	
//	getter and setter AccHolderName
	
	public String getAccHolderName()
	{
		return AccHolderName;
	}
	
	public void setAccHolderName(String accHolderName)
	{
		if(accHolderName != null && !accHolderName.isEmpty())
        {
            this.AccHolderName = accHolderName;
        }
        else
        {
            System.out.println("Please provide a valid name.");
        }

	}
	
//	Getter and setter AccNumber
	
	public String getAccNumber() {
        return AccNumber;
    }
    
    public void setAccNumber(String accNumber)
    {
    	if(accNumber != null && !accNumber.isEmpty())
        {
            this.AccNumber = accNumber;
        }
        else
        {
            System.out.println("Please provide a Account Number.");
        }    }
    
//    getter and setter Balance
    
    public double getBalance() {
        return Balance;
    }
    
    public void setBalance(double balance)
    {
        if(balance > 10000)
        {
            this.Balance = balance;
        }
        else
        {
            System.out.println("Enter a valid order amount.");
        }
    }
    
//    Account Status
    
    public String getAccStatus()
    {
    	return AccStatus;
    }
    
    public void CheckAccStatus()
    {
        // Check if account details are provided
        if(AccHolderName != null && !AccHolderName.isEmpty() && !AccNumber.isEmpty() && Balance > 10000)
        {
            AccStatus = "Active"; // Changed from OrderStatus to AccountStatus
            System.out.println("Account Status: " + AccStatus);
        }
        else
        {
            System.out.println("Account is not active. Missing details.");
        }
    }
}

public class Encapusulationn1 {
	public static void main(String [] args)
	{
		Account ac=new Account();
		ac.setAccHolderName("Omkar");
		ac.setAccNumber("12345678");
		ac.setBalance(15000.00);
		
		ac.CheckAccStatus();
	}
}
