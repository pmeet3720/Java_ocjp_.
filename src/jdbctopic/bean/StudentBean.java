package jdbctopic.bean;

import java.util.Scanner;

public class StudentBean {
	
	private int rno,std,marks;
	private String name;
	
	public StudentBean() {
		
	}

	public StudentBean(int rno, int std, int marks, String name) {
		super();
		this.rno = rno;
		this.std = std;
		this.marks = marks;
		this.name = name;
	}

	public int getRno() {
		return rno;
	}

	public void setRno(int rno) {
		this.rno = rno;
	}

	public int getStd() {
		return std;
	}

	public void setStd(int std) {
		this.std = std;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void scanData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter name: ");
		name = sc.nextLine();
		
		System.out.println("enter std: ");
		std = sc.nextInt();
		
		System.out.println("enter marks: ");
		marks = sc.nextInt();
	}
	
	
	

}
