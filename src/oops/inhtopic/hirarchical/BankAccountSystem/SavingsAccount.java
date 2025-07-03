package oops.inhtopic.hirarchical.bankAccountSystem;

public class SavingsAccount extends BankAccount {
	
	int interestRate;
	int duration;
	float interest;
	
	public SavingsAccount() {
		
	}
	
	public SavingsAccount(long accountNumber, String accountHolderName, long balance, int interestRate, int numberOfDays) {
		
		super(accountNumber, accountHolderName, balance);
		
		this.interestRate = interestRate;
		
		this.duration = numberOfDays;
	}
	
	public void calculateInterest() {
		
		interest = (balance*interestRate*duration)/100;
		
	}
	
	public void displayDetails() {
		System.out.println("Account Number: "+accountNumber+"\n"+"Account Holder Name: "+accountHolderName+"\n"+"Account Balance: "+balance+"\n"+"Interest : "+interest);
	}

}
