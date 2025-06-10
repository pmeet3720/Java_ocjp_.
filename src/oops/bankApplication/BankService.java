package oops.bankApplication;

import java.util.Scanner;
public class BankService {
	
	public static void bankAccount(BankAccount account) {
		Scanner sc = new Scanner(System.in);
		double amount;
		int choice;
		
		
		while(true) {
			System.out.println("1__deposit");
			System.out.println("2__withdraw");
			System.out.println("3__calculateInterest");
			System.out.println("4__checkBalance");
			System.out.println("5__exit");
			
			System.out.println("Enter method choice: ");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter amount to deposit: ");
				amount = sc.nextInt();
				account.deposit(amount);
				break;
				
			case 2:
				System.out.println("Enter amount to withdraw: ");
				amount = sc.nextInt();
				account.withdraw(amount);
				break;
				
			case 3:
				account.calculateInterest();
				break;
			case 4:
				account.checkBalance();
				break;
			case 5:
				System.out.println("Thank you for visiting");
				System.exit(0);

			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String accNum,holderName;
		double bal;
		
		System.out.println("1__Saving Account");
		System.out.println("2__Current Account");
		
		System.out.println("Enter account choice: ");
		int choice = sc.nextInt();
		
		
		switch (choice) {
		case 1:System.out.println("Enter account number: ");
		       accNum = sc.nextLine();
		       sc.nextLine();
		       System.out.println("Enter holder name: ");
		       holderName = sc.nextLine();
		       System.out.println("Enter balance: ");
		       bal = sc.nextDouble();
			   bankAccount(new SavingAccount(accNum,holderName,bal));
			   break;
		case 2:System.out.println("Enter account number: ");
		       accNum = sc.nextLine();
		       sc.nextLine();
		       System.out.println("Enter holder name: ");
		       holderName = sc.nextLine();
		       System.out.println("Enter balance: ");
		       bal = sc.nextDouble();
			   bankAccount(new CurrentAccount(accNum,holderName,bal));
		       break;

		}
	}

}
