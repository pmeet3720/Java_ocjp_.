package oops.abstractiontopic.task.task1;

import java.util.Scanner;
public class TestAppRuntime {
	
	public static void getExecutedByProfile(Person person) {
		person.getBehave();
		
		
		// to access any child specific method we need to do downcast of parent to child
		//downcast
		if(person instanceof Home) {
			Home home = (Home)person;
			home.getMovieTime();
		}else if(person instanceof School) {
			School school = (School)person;
			school.getResult();
		}else if(person instanceof PublicPlace) {
			PublicPlace pub = (PublicPlace)person;
			pub.getPublicEvents();
		}else if(person instanceof Org) {
			Org org = (Org)person;
			org.getSalary();
		}
	}
	
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
//			       person.getBehave();
			       getExecutedByProfile(person);
				   break;
				
			case 2:person = new PublicPlace();
//		           person.getBehave();
			       getExecutedByProfile(person);
				   break;
				
			case 3:person = new School();
//		           person.getBehave();
			       getExecutedByProfile(person);
				   break;
				
			case 4:person = new Org();
//			       person.getBehave();
			       getExecutedByProfile(person);
			       break;
	
		}

	}

}
