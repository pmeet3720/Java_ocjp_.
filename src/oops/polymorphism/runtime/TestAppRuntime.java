package oops.polymorphism.runtime;

import java.util.Scanner;
public class TestAppRuntime {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1__Home");
		System.out.println("2__PublicPlace");
		System.out.println("3__School");
		System.out.println("4__Org");
		
		System.out.println("Enter choice: ");
		int choice = sc.nextInt();
		
		Person person = null;
		
		switch (choice) {
			case 1:person = new Home();
			       person.getBehave();
				   break;
				
			case 2:person = new PublicPlace();
		           person.getBehave();
				   break;
				
			case 3:person = new School();
		           person.getBehave();
				   break;
				
			case 4:person = new Org();
			       person.getBehave();
				   break;
	
		}

	}

}
