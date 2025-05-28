package oops.classandobject;

import java.util.Scanner;
public class EmployeeData {
	
	private int id,salary;
	private String desg, orgname, name;
	
	public void scanData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter employee id: ");
		id = sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("Enter employee name: ");
		name = sc.nextLine();
		
		System.out.println("Enter designation: ");
		desg = sc.nextLine();
		
		System.out.println("Enter salary: ");
		salary = sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("Enter organization name: ");
		orgname = sc.nextLine();
		
	}
	
	public void dispData() {
		System.out.println(id+" "+name+" "+desg+" "+salary+" "+orgname);
	}
	
	public static void main(String[] args) {
		
		EmployeeData e1 = new EmployeeData();
		EmployeeData e2 = new EmployeeData();
		EmployeeData e3 = new EmployeeData();
		
		e1.scanData();
		e2.scanData();
		e3.scanData();
		
		e1.dispData();
		e2.dispData();
		e3.dispData();
	}

}
