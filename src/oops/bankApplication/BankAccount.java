package oops.bankApplication;

public abstract class BankAccount {
	
	private String bankHolderName;
	private String accountNumber;
	protected double balance;
	
	
	public BankAccount(String accountNumber, String bankHolderName, double balance) 
	{
		this.bankHolderName = bankHolderName;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	public void deposit(double amount) 
	{
		if(amount>0) {
			balance += amount;
			System.out.println(amount+" is deposited.");
		}else {
			System.out.println("Invalid deposit amount..");
		}
	}
	
	//withdrawal method is acts different for savings and current account
	public abstract void withdraw(double amount);
	
	public abstract void calculateInterest();
	
	public void checkBalance() 
	{
		System.out.println("Your balance in account "+accountNumber+" is "+balance);
	}
	
	

}
