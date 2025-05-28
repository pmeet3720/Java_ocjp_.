package oops.inhtopic.mul;

import java.util.Scanner;
public class StudentResult extends StudentManagement {
	
	int []marks = new int[3];
	int total;
	float average;
	
	public void getMarks() {
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<3;i++) {
			marks[i] = sc.nextInt();
		}
	}
	
	public void calculateResult() {
		for(int i=0;i<3;i++) {
			total = total + marks[i];
		}
		average = total/3;
	}
	
	public void displayResult() {
		for(int i=0;i<3;i++) {
			System.out.print(marks[i]+" ");
		}
		System.out.println();
		
		System.out.println("Total: "+total);
		System.out.println("Average: "+average);
	}

}
