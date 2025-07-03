package bankApplicationSystem.collection.arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class BankApp {
	
	public static Account getAccountByAccountNum(ArrayList<Account> list, long accntNum) {
		Account ac;
		
		for(int i=0;i<list.size();i++) {
			ac = list.get(i);
			if(ac.getAccntNum() == accntNum) {
				return ac;
			}
		}
		
		return null;
		
	}
	
	public static Integer getAccountIndex(ArrayList<Account> list, long accntNum) {
		Account ac;
		
		for(int i=0;i<list.size();i++) {
			ac = list.get(i);
			if(ac.getAccntNum() == accntNum) {
				return i;
			}
		}
		
		return null;
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Account> list = new ArrayList<Account>();
		int choice = 0,cnt=0;
		long accntNum=0;
		Integer index;
		double amt;
		double avalBal = 10000;
		
		do {
			System.out.println("1) Create account");
			System.out.println("2) Update account details");
			System.out.println("3) Show balance");
			System.out.println("4) Withdraw");
			System.out.println("5) Deposit");
			System.out.println("6) Transfer amount to another account");
			System.out.println("7) Delete account");
			System.out.println("8) Display account");
			System.out.println("9) Exit");
			
			System.out.println("enter choice: ");
			choice = sc.nextInt();
			Account ac = new Account();
			
			switch (choice) {
			case 1:
				   ac.scanData();
				   list.add(ac);
				   System.out.println("account created successfully.");
				
				   break;
				   
			case 2:
				
				   System.out.println("Enter account number to update: ");
				   accntNum = sc.nextLong();
				   index = getAccountIndex(list,accntNum);
				   
				   if(index != null) {
					   ac = list.get(index);
					   ac.updateData();
					   list.set(index, ac);
					   System.out.println("Account updated successfully.");
				   }else {
					   System.out.println("Account doesn't exists.");
				   }
				   
				
				   break;
				   
				   
			case 3:
				   System.out.println("Enter account number to check balance: ");
				   accntNum = sc.nextLong();
				   
				   index = getAccountIndex(list,accntNum);
				   if(index != null) {
					   ac = list.get(index);
					   avalBal = ac.getBalance();
					   System.out.println(avalBal);
				   }else {
					   System.out.println("Account doesn't exists.");
				   }
				
				   break;
				   
			case 4:
				   System.out.println("Enter account number to withdraw: ");
				   accntNum = sc.nextLong();
				   System.out.println("Enter withdraw amount: ");
				   amt = sc.nextDouble();
				   
				   index = getAccountIndex(list,accntNum);
				   if(index != null) {
					   ac = list.get(index);
					   ac.withdraw(amt);
					   avalBal = ac.getBalance();
					   System.out.println("Available balance after withdrawal: "+avalBal);
				   }else {
					   System.out.println("Account doesn't exists.");
				   }
				
				   break;
				   
			case 5:
				   System.out.println("Enter account number to deposit: ");
				   accntNum = sc.nextLong();
				   System.out.println("Enter amount: ");
				   amt = sc.nextDouble();
				   
				   index = getAccountIndex(list,accntNum);
				   if(index != null) {
					   ac = list.get(index);
					   ac.deposit(amt);
					   avalBal = ac.getBalance();
					   System.out.println("Available balance after deposit: "+avalBal);
				   }else {
					   System.out.println("Account doesn't exists.");
				   }
				
				   break;
				   
			case 6:
				   System.out.println("Enter account number to deposit: ");
				   accntNum = sc.nextLong();
				   System.out.println("Enter amount: ");
				   amt = sc.nextDouble();
				   
				   index = getAccountIndex(list,accntNum);
				   if(index != null) {
					   ac = list.get(index);
					   ac.deposit(amt);
					   avalBal = ac.getBalance();
					   System.out.println("Available balance after deposit: "+avalBal);
				   }else {
					   System.out.println("Account doesn't exists.");
				   }
				
				   break;
				   
			case 7:
				   System.out.println("Enter account number to delete: ");
				   accntNum = sc.nextLong();
				   
				   index = getAccountIndex(list,accntNum);
				   
				   if(index != null) {
					   ac = list.get(index);
					   list.remove(ac);
					   System.out.println("Account removed successfully.");
				   }else {
					   System.out.println("Account doesn't exists.");
				   }
				   
				   break;
				   
				   
			case 8:
				cnt = 0;
				   for(int i=0;i<list.size();i++) {
					   System.out.println("Account: "+(++cnt));
					   ac = list.get(i);
					   ac.dispData();
//					   cnt++;
				   } 
				
				   break;
				   
			case 9:
				   System.exit(0);
				   try {
						Thread.sleep(3000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				
				   break;
	
			}
			
		}while(choice != 9);
		
	}

}
