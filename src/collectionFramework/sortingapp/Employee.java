package collectionFramework.sortingapp;

import java.util.Scanner;

public class Employee {
	
	private int empId;
	private String name;
	private double salary;
	private int level;
	
	public Employee() {
		
	}

	public Employee(int empId, String name, double salary, int level) {
		super();
		this.empId = empId;
		this.name = name;
		this.salary = salary;
		this.level = level;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}
	
	public void updateData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name: ");
		name = sc.nextLine();
		
		System.out.println("Enter salary: ");
		salary = sc.nextDouble();
		
		System.out.println("Enter level: ");
		level = sc.nextInt();
	}
	
	public void dispData() {
		System.out.println(getEmpId()+" "+getName()+" "+getSalary()+" "+getLevel());
	}
	
	

}
