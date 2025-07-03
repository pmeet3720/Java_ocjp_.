package bankApplicationSystem.collection.arrayList;

import java.util.Scanner;

public class Account {
	
	private long accntNum;
	private String accntHolderName;
	private String accntType; //savings or current
	private double balance;
	private long mobileNum;
	private String email;
	
	public Account() {
		
	}

	public long getAccntNum() {
		return accntNum;
	}

	public void setAccntNum(long accntNum) {
		this.accntNum = accntNum;
	}

	public String getAccntHolderName() {
		return accntHolderName;
	}

	public void setAccntHolderName(String accntHolderName) {
		this.accntHolderName = accntHolderName;
	}

	public String getAccntType() {
		return accntType;
	}

	public void setAccntType(String accntType) {
		this.accntType = accntType;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public long getMobileNum() {
		return mobileNum;
	}

	public void setMobileNum(long mobileNum) {
		this.mobileNum = mobileNum;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public void scanData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter account number: ");
		accntNum = sc.nextLong();
		
		sc.nextLine();
		System.out.println("enter account holder name: ");
		accntHolderName = sc.nextLine();
		
		System.out.println("enter account type: ");
		accntType = sc.nextLine();
		
		System.out.println("enter account balance: ");
		balance = sc.nextDouble();
		
		System.out.println("enter mobile number: ");
		mobileNum = sc.nextLong();
		
		sc.nextLine();
		
		System.out.println("enter email: ");
		email = sc.nextLine();
	}
	
	public void updateData() {
		Scanner sc = new Scanner(System.in);
//		sc.nextLine();
		System.out.println("enter account holder name: ");
		accntHolderName = sc.nextLine();
		
		System.out.println("enter mobile number: ");
		mobileNum = sc.nextLong();
		
		sc.nextLine();
		
		System.out.println("enter email: ");
		email = sc.nextLine();
	}
	
	public void withdraw(double amt) {
		if(this.balance < 5000) {
			System.out.println("Insufficient balance.");
		}else {
			this.setBalance(balance-amt);
			System.out.println("Amount withdrawen successfully.");
		}
		
	}
	
	public void deposit(double amt) {
		this.setBalance(balance+amt);
		System.out.println("Amount deposited successfully.");
	}
	
	public void dispData() {
		System.out.println("\t\tAccountNum\t\tAccountHolderName\t\tAccountType\t\tAccountBalance\t\tMobileNumber\t\tEmail");
		System.out.println("Account Details: "+accntNum+"\t\t     "+" "+accntHolderName+"\t\t       "+accntType+"\t\t       "+balance+"\t\t       "+mobileNum+"\t\t     "+email);
	}

}
