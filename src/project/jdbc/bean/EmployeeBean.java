package project.jdbc.bean;

import java.util.Scanner;

public class EmployeeBean {
	
	private int emp_id;
	private String name;
	private String department;
	private String designation;
	private double salary;
	
	public EmployeeBean() {
		
	}

	public EmployeeBean(int emp_id, String name, String department, String designation, double salary) {
		super();
		this.emp_id = emp_id;
		this.name = name;
		this.department = department;
		this.designation = designation;
		this.salary = salary;
	}

	public int getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public void scanEmpData() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter employee name: ");
		name = sc.nextLine();
		
		System.out.println("Enter department: ");
		department = sc.nextLine();
		
		System.out.println("Enter designation: ");
		designation = sc.nextLine();
		
		System.out.println("Enter salary: ");
		salary = sc.nextDouble();
	}
	
	

}
