package studentManagementSystem.collection.arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagementSystem {
	
	public static Student getStudentRecordByRno(ArrayList<Student> list, int searchRno) {
		
		Student s;
		for(int i=0;i<list.size();i++) {
		   s = list.get(i);
		   if(s.getRno() == searchRno) {
			   return s;
		   }
	   }
		
		return null;
		
	}
	
    public static Student getStudentRecordByName(ArrayList<Student> list, String searchName) {
		
		Student s;
		for(int i=0;i<list.size();i++) {
		   s = list.get(i);
		   if(s.getName().equalsIgnoreCase(searchName)) {
			   return s;
		   }
	   }
		
		return null;
		
	}
	
    public static Integer getStudentIndex(ArrayList<Student> list, int searchRno) {
		
		Student s;
		for(int i=0;i<list.size();i++) {
		   s = list.get(i);
		   if(s.getRno() == searchRno) {
			   return i;
		   }
	   }
		
		return null;
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Student> list = new ArrayList<Student>();
		Integer index = 0;
		int choice = 0;
		boolean flag;
		
		do {
			System.out.println("1) Insert student record");
			System.out.println("2) Update student record");
			System.out.println("3) Delete student record");
			System.out.println("4) Search student record using rno");
			System.out.println("5) Search student record using name");
			System.out.println("6) Display student record");
			System.out.println("7) Exit");
			
			System.out.println("enter choice: ");
			choice = sc.nextInt();
			
			Student s = new Student();
			
			switch (choice) {
			case 1:
				   s.scanData();
				   list.add(s);
				   System.out.println("student record inserted successfully");
				   break;
				   
			case 2:
				   System.out.println("enter which student to update by rno: ");
				   int updateRno = sc.nextInt();
				   
				   index = getStudentIndex(list,updateRno);
				   
				   if(index != -1) {
					   s = list.get(index);
					   s.updateData();
					   list.set(index, s);
					   
					   System.out.println("Student record updated successfully.");
				   }else {
					   System.out.println("Student record not found in database.");
				   }
				   
				   break;
				   
			case 3:
				   System.out.println("enter Rno to delete: ");
				   int searchRno = sc.nextInt();
				   index = getStudentIndex(list,searchRno);
				   
				   if(index != null) {
					   list.remove(index);
					   System.out.println("student successfully deleted from record.");
				   }else {
					   System.out.println("student not found in database.");
				   }
				   break;   
				   
			case 4:
				   System.out.println("enter Rno to search student: ");
				   searchRno = sc.nextInt();
				   s = getStudentRecordByRno(list,searchRno);
				   
				   if(s != null) {
					   System.out.println("Student record found!");
					   s.dispData();
				   }else {
					   System.out.println("Student record not found in database");
				   }
				   break;
				   
			case 5:
				   System.out.println("enter Name to search student: ");
				   sc.nextLine();
				   String searchName = sc.nextLine();
				   s = getStudentRecordByName(list,searchName);
				   
				   if(s != null) {
					   System.out.println("Student record found!");
					   s.dispData();
				   }else {
					   System.out.println("Student record not found in database.");
				   }
				   break;
				   
			case 6:
				   System.out.println("Rno  Name  Std");
				   for(int i=0;i<list.size();i++) {
					   s = list.get(i);
					   s.dispData();
				   }
				   break; 
				   
			case 7:System.exit(0);
			       System.out.println("system will exit in 3 seconds");
			       
			       try {
						 Thread.sleep(3000);
				   } catch (InterruptedException e) {
						e.printStackTrace();
				   }
				   break;
	
			}
		}while(choice != 7);
		
		
	}
	
	

}
