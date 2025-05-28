package oops.polymorphism.compiletime;

public class ATM {
	
	// Method Overloading
	
	public static void withdraw(int amount) {
		System.out.println("withdrawing amount : "+amount+" using debitcard");
	}
	
	public static void withdraw(int amount, String accountNumber) {
		System.out.println("withdrawing amount : "+amount + " from account: "+accountNumber);
	}
	
	public static void withdraw(int amount, int otp) {
		System.out.println("withdrawing amount: "+amount+" using otp: "+otp);
	}
	
	public static void main(String[] args) {
		ATM.withdraw(30000);
	}

}
