package iotopic.byteorientedway.serializabletopic;

import java.io.Serializable;
import java.util.Scanner;
public class Employee implements Serializable {
	
	private int emp_Id;
	private String emp_name;
	private long salary;
	private String org_name;
	private String desg;
	private String location;
	
	public Employee() {
		
		this.org_name = "Amazon";
		
	}

	public Employee(int emp_Id, String emp_name, long salary, String org_name, String location) {
		super();
		this.emp_Id = emp_Id;
		this.emp_name = emp_name;
		this.salary = salary;
		this.org_name = org_name;
		this.location = location;
	}
	
	public void scanData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter emp_ID: ");
		this.emp_Id = sc.nextInt();
		
		sc.nextLine();
		System.out.println("Enter name: ");
		this.emp_name = sc.nextLine();
		
		System.out.println("Enter salary: ");
		this.salary = sc.nextLong();
		
		sc.nextLine();
		
		System.out.println("Enter designation: ");
		this.desg = sc.nextLine();
		
		System.out.println("Enter location: ");
		this.location = sc.nextLine();
	}

	public int getEmp_Id() {
		return emp_Id;
	}

	public void setEmp_Id(int emp_Id) {
		this.emp_Id = emp_Id;
	}

	public String getEmp_name() {
		return emp_name;
	}

	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}

	public long getSalary() {
		return salary;
	}

	public String getDesg() {
		return desg;
	}

	public void setDesg(String desg) {
		this.desg = desg;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	public String getOrg_name() {
		return org_name;
	}

	public void setOrg_name(String org_name) {
		this.org_name = org_name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	
	

}
