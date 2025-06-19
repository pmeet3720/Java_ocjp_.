package iotopic.byteorientedway.serializabletopic;

import java.io.Serializable;
import java.util.Scanner;

public class Student implements Serializable {
	
	private int rno;
	private String name;
	private transient int std; //if we don't wanna write any attribute to file then make
	// it transient
	
	public Student() {
		
	}
	
	public Student(int rno, String name, int std) {
		super();
		this.rno = rno;
		this.name = name;
		this.std = std;
	}
	
	public void scanData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter rno: ");
		this.rno = sc.nextInt();
		sc.nextLine();
		
		System.out.println("enter name: ");
		this.name = sc.nextLine();
		
		System.out.println("enter std: ");
		this.std = sc.nextInt();
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
	
	

}
