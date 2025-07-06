package project.jdbc.main;

import java.util.ArrayList;
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
		int choice = 0, rowAffected = 0;
		
		do {
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
					emp.scanEmpData();
					rowAffected = EmployeeDao.insertEmployee(emp);
					
					if(rowAffected > 0) {
						System.out.println("Employee record successfully inserted: "+rowAffected);
					}else {
						System.out.println("Employee record not inserted. "+rowAffected);
					}
				
					break;
					
			case 2:
					System.out.println("Enter empID to delete Employee: ");
					emp_id = sc.nextInt();
					rowAffected = EmployeeDao.deleteEmployeeByEmpID(emp_id);
					
					if(rowAffected > 0) {
						System.out.println("Employee record deleted successfully. "+rowAffected);
					}else {
						System.out.println("EMployee record not deleted. "+rowAffected);
					}
					
					break;
				
			case 3:
					System.out.println("Enter empID to update employee record: ");
					emp_id = sc.nextInt();
					
					sc.nextLine();
					System.out.println("Enter employee name: ");
					name = sc.nextLine();
					
					System.out.println("Enter department: ");
					department = sc.nextLine();
					
					System.out.println("Enter designation: ");
					designation = sc.nextLine();
					
					System.out.println("Enter salary: ");
					salary = sc.nextDouble();
					
					emp = new EmployeeBean(0,name,department,designation,salary);
					
					rowAffected = EmployeeDao.updateEmployeeByEmpID(emp, emp_id);
					
					if(rowAffected > 0) {
						System.out.println("Employee record updated successfully. "+rowAffected);
					}else {
						System.out.println("Employee not found in record. "+rowAffected);
					}
				
					break;
				
			case 4:
					System.out.println("Enter empID to search for empolyee: ");
					emp_id = sc.nextInt();
					
					emp = EmployeeDao.getEmployeeByEmpID(emp_id);
				
					if(emp != null) {
						System.out.println(emp.getEmp_id()+" "+emp.getName()+" "+emp.getDepartment()+" "+emp.getDesignation()+" "+emp.getSalary());
					}else {
						System.out.println("Employee not found in records.");
					}
					break;
				
			case 5:
					ArrayList<EmployeeBean> list = EmployeeDao.getEmployeeRecords();
					
					for (int i = 0; i < list.size(); i++) {
						emp = list.get(i);
						System.out.println(emp.getEmp_id()+" "+emp.getName()+" "+emp.getDepartment()+" "+emp.getDesignation()+" "+emp.getSalary());
					}
				
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
		}while(choice != 6);
	}
}
