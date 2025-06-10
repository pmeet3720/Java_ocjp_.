package oops.bankApplication;

public class SavingAccount extends BankAccount {
	
	private static final double min_balance = 500.00;
	private static final double interest_rate = 0.05;
	
	
	public SavingAccount(String bankHolderName, String accountNumber, double balance) {
		super(bankHolderName, accountNumber, balance);
	}
	@Override
	public void withdraw(double amt) {
		if((balance-amt)>min_balance) 
		{
			balance -= amt;
			System.out.println(amt+" is withdrawen from saving account.");
		}else 
		{
			System.out.println("withdrawen failed. Min balance must be maintained");
		}
	}
	@Override
	public void calculateInterest() 
	{	
		double interest = balance*interest_rate;
		balance = balance + interest;
		System.out.println("Interest added to saving account.");
	}
	
	

}
