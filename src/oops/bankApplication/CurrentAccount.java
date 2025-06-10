package oops.bankApplication;

public class CurrentAccount extends BankAccount{

	public CurrentAccount(String bankHolderName, String accountNumber, double balance) {
		super(bankHolderName, accountNumber, balance);
	}

	@Override
	public void withdraw(double amount) 
	{
		if(amount <= balance) 
		{
			balance -= amount;
			System.out.println(amount+ " is withdrawen, from current account");
		}else 
		{
			System.out.println("Withdrawen failed. Insufficient balance");
		}
	}

	@Override
	public void calculateInterest() 
	{
		System.out.println("No interest for current account.");
		
	}
	
}
