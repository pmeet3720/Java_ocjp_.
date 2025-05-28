package oops.inhtopic.hirarchical.BankAccountSystem;

public class BankAccount {
	
	protected long accountNumber;
	protected String accountHolderName;
	public long balance;
	
	public BankAccount() {
		
	}
	
	public BankAccount(long accountNumber, String accountHolderName, long balance) {
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.balance = balance;
	}
	
	public void displayAccountDetails() {
		System.out.println("Account Number: "+accountNumber+"\n"+"Account Holder Name: "+accountHolderName+"\n"+"Account Balance: "+balance);
	}

}
