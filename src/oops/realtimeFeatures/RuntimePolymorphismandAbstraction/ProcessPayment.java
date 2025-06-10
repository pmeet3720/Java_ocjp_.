package oops.realtimeFeatures.RuntimePolymorphismandAbstraction;

import java.util.Scanner;
public class ProcessPayment {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1___CreditCard Payment");
		System.out.println("2___UPI Payment");
		System.out.println("3___NetBanking Payement");
		
		System.out.println("Select payment process.....");
		int choice = sc.nextInt();
		
		Payment pc = null;
		
		switch (choice) {
		case 1:pc = new CreditCardPayment("Meet","1234xxxxxxxx","05/26","266");
		       pc.makePayment(56000);
			   break;
			   
		case 2:pc = new UPI("Raghav","9825647465@axl","9825647465");
		       pc.makePayment(60000);
			   break;
          
			   
		case 3:pc = new NetBanking("Neha","Kotak Bank","12345432xxxx","kotak0ahd");
		       pc.makePayment(80000);
			   break;
			   
		}
	}

}
