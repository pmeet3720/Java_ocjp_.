package studentManagementSystem.collection.arrayList;

import java.util.Scanner;

public class Student {
	
	private int rno;
	private String name;
	private int std;
	
	public Student() {
		
	}

	public int getRno() {
		return rno;
	}

	public void setRno(int rno) {
		this.rno = rno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStd() {
		return std;
	}

	public void setStd(int std) {
		this.std = std;
	}
	
	public void scanData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter rno: ");
		rno = sc.nextInt();
		
		sc.nextLine();
		System.out.println("enter name: ");
		name = sc.nextLine();
		
		System.out.println("enter std: ");
		std = sc.nextInt();
	}
	
	public void updateData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter name: ");
		name = sc.nextLine();
		this.setName(name);
		
		System.out.println("enter std: ");
		std = sc.nextInt();
		this.setStd(std);
	}
	
	
	public void dispData() {
		System.out.println(rno+" "+name+" "+std);
	}
	
	

}
