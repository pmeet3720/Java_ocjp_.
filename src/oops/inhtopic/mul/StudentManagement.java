package oops.inhtopic.mul;

import java.util.Scanner;
public class StudentManagement {
	
	int rollno;
	String name;
	
	public void getStudentDetails() {
		Scanner sc = new Scanner(System.in);
		this.rollno = sc.nextInt();
		sc.nextLine();
		this.name = sc.nextLine();
	}
	
	public void displayStudentDetails() {
		System.out.println("Roll No.: "+rollno+"\n"+"Name: "+name);
	}

}
