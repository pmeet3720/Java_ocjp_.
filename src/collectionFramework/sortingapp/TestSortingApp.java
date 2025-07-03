package collectionFramework.sortingapp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class TestSortingApp {
	
	public static Integer getEmployeeIndexByEmpID(ArrayList<Employee> list, int empId) {
		for(int i=0;i<list.size();i++) {
			Employee e = list.get(i);
			if(e.getEmpId() == empId) {
				return i;
			}
		}
		return null;
	}
	
	public static Employee getEmployeeByEmpId(ArrayList<Employee> list, int empId) {
		for(int i=0;i<list.size();i++) {
			Employee e = list.get(i);
			if(e.getEmpId() == empId) {
				return e;
			}
		}
		return null;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Employee e1 = new Employee(101,"Sagar",25000,2);
		Employee e2 = new Employee(102,"Mahesh",55000,1);
		Employee e3 = new Employee(103,"kabir",45000,3);
		Employee e4 = new Employee(104,"Neha",35000,4);
		Employee e5 = new Employee(105,"Aadish",65000,5);
		
		ArrayList<Employee> list = new ArrayList<Employee>();
		
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);
		
		Iterator<Employee> itr = list.iterator();
		
		int choice;
		int c,empId;
		Integer index;
		
		do {
			System.out.println("1) Sort in ascending order");
			System.out.println("2) Sort in descending order");
			System.out.println("3) Update employee details");
			System.out.println("4) Delete employee");
			System.out.println("5) Search Employee using EmpID");
			System.out.println("6) Display employee data");
			System.out.println("7) Exit");
			
			System.out.println("enter choice: ");
			choice = sc.nextInt();
			Employee e = new Employee();
			
			switch (choice) {
			case 1:
				    System.out.println("1) Name wise sorting");
				    System.out.println("2) Salary wise sorting");
				    System.out.println("3) Level wise sorting");
				    System.out.println("4) Exit");
				    
				    System.out.println("enter choice: ");
				    c = sc.nextInt();
				    
				    switch (c) {
					case 1:
						  
						    System.out.println("------After Name wise sorting------");
						    Collections.sort(list, new NameWiseEmployeeSorting());
						    
						    e.dispData();
						    
							break;
							
					case 2:
							System.out.println("------After Salary wise sorting------");
						    Collections.sort(list, new SalaryWiseEmployeeSorting());
						    
						    e.dispData();
						
							break;
							
					case 3:
						
							System.out.println("------After Level wise sorting------");
						    Collections.sort(list, new LevelWiseEmployeeSorting());
						    
						    e.dispData();
						
							break;
							
					case 4:
						    System.exit(0);
						
							break;
	
					
					}
					break;
					
			case 2:
				    System.out.println("1) Highest salary wise sorting");
				    System.out.println("2) Highest level wise sorting");
				    System.out.println("3) Exit");
				    
				    System.out.println("enter choice: ");
				    c = sc.nextInt();
				    
				    switch (c) {
					case 1:
						    System.out.println("-----After sorting according to highest salary-----");
						    Collections.sort(list, new HighestSalaryWiseSorting());
						    
						    e.dispData();
						
							break;
							
					case 2:
						
						    System.out.println("-----After sorting according to highest level------");
						    Collections.sort(list, new HighestLevelWiseSorting());
						
						    e.dispData();
							break;
							
					case 3:
						    System.exit(0);
						
							break;
					
					}
				    
				    
					break;
					
			case 3:
				    System.out.println("Enter employee Id to update: ");
				    empId = sc.nextInt();
				    index = getEmployeeIndexByEmpID(list,empId);
				    
				    if(index != null) {
				    	e = list.get(index);
				    	e.updateData();
				    	list.set(index, e);
				    	System.out.println("Employee updated successfully.");
				    }else {
				    	System.out.println("Employee not found in records.");
				    }
				
					break;
					
			case 4:
				
					System.out.println("Enter employee Id to delete: ");
				    empId = sc.nextInt();
				    
				    index = getEmployeeIndexByEmpID(list,empId);
				    
				    if(index != null) {
				    	e = list.get(index);
				    	list.remove(e);
				    	System.out.println("Employee removed from records.");
				    }else {
				    	System.out.println("Employee not found in records.");
				    }
				    
				
					break;
			
			case 5:
					System.out.println("Enter employee Id to search: ");
				    empId = sc.nextInt();
				    
				    e = getEmployeeByEmpId(list,empId);
				    
				    if(e != null) {
				    	System.out.println("Employee found!");
				    	e.dispData();
				    }else {
				    	System.out.println("Employee not found in records.");
				    }
				
					break;
					
			case 6:
				
			        itr = list.iterator();
				    while(itr.hasNext()) {
				    	e = itr.next();
				    	e.dispData();
				    }
				
					break;
					
			case 7:
				    System.exit(0);
					try {
						Thread.sleep(3000);
					} catch (InterruptedException er) {
						er.printStackTrace();
					}
				
					break;
	
			}
	}while(choice != 7);
	}

}
