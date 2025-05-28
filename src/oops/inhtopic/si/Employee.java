package oops.inhtopic.si;

import java.util.Scanner;
public class Employee extends Person {
	
	private int id,salary;
	private String dsg,orgname;
	
	public void scanData() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter EmpId: ");
		id = sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("Enter EmpName: ");
		name = sc.nextLine();
		
		System.out.println("Enter Salary: ");
		salary = sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("Enter designation: ");
		dsg = sc.nextLine();
		
		System.out.println("Enter organization name: ");
		orgname = sc.nextLine();
		
	}
	
	public void dispData() {
		System.out.println(id+" "+name+" "+salary+" "+dsg+" "+orgname);
	}

}
