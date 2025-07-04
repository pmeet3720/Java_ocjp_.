package project.jdbc.main;

import java.util.Scanner;

import project.jdbc.bean.EmployeeBean;
import project.jdbc.dao.EmployeeDao;

public class EmployeeRecordManagementSystem {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int emp_id;
		String name,department,designation;
		double salary;
		
		EmployeeBean emp = new EmployeeBean();
		int choice = 0;
		
		System.out.println("1) Insert employee");
		System.out.println("2) Delete employee by emp_id");
		System.out.println("3) Update employee by emp_id");
		System.out.println("4) Search employee by emp_id");
		System.out.println("5) Display employee data");
		System.out.println("6) Exit");
		
		System.out.println("enter choice: ");
		choice = sc.nextInt();
		
		switch (choice) {
		case 1:
			
				break;
				
		case 2:
			
				break;
			
		case 3:
			
				break;
			
		case 4:
			
				break;
			
		case 5:
			
				break;
			
		case 6:
				System.exit(0);
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				break;

		}
	}

}
