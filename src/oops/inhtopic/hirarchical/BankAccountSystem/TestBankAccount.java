package oops.inhtopic.hirarchical.bankAccountSystem;

public class TestBankAccount {
	
	public static void main(String[] args) {
		SavingsAccount sa = new SavingsAccount(1234567878,"Meet",9800000,12,90);
		sa.calculateInterest();
		sa.displayDetails();
	}

}
