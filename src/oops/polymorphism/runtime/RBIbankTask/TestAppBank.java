package oops.polymorphism.runtime.RBIbankTask;

import java.util.Scanner;
public class TestAppBank {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1__Axis");
		System.out.println("2__SbiBank");
		System.out.println("3__KotakBank");
		System.out.println("4__HdfcBank");
		
		System.out.println("Enter which bank to invest: ");
		int choice = sc.nextInt();
		
		RbiBank rbi = null;
		int roi=0;
		long amount = 250000L;
		
		switch (choice) {
		case 1:rbi = new AxisBank();
		       roi = rbi.getRoi();
			   break;
			   
		case 2:rbi = new SbiBank();
	           roi = rbi.getRoi();
			   break;
 
		case 3:rbi = new KotakBank();
	       	   roi = rbi.getRoi();
			   break;
		
		case 4:rbi = new HdfcBank();
	           roi = rbi.getRoi();
			   break;
			   
		}
		
		System.out.println("Interest: "+(roi*amount)/100);
		
	}
		
		

}
