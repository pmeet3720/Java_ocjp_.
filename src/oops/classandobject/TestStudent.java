package oops.classandobject;

import java.util.Scanner;

// pure Encapsulation example - where DM's are private and MF's are public
public class TestStudent {
	//object -- to access class properties (data members + member function)
	
	// class properties - 1) data members -- data, + 2)member functions -- operations
	
	
	//data members
	private int rno,std;
	private String name;
	
	//member function
	
    //Constructors - two types in Java --- 1) Default, 2) Para + Copy
	
	public TestStudent(){ // make it public so we can access it from other classes of same package
	
		
		System.out.println("Entry in default constructor");
		
		System.out.println(rno+" "+name+" "+std);
		
		rno = 1;
		name = "Meet";
		std = 12;
		
		System.out.println(rno+" "+name+" "+std);
		
		System.out.println("Exit from default constructor");
		
	} // default
	
	
	// three argument constructor
	public TestStudent(int rno, String name, int std) {
		System.out.println("Entry in parametrized constructor");
		
		this.rno = rno; // when local variable (rno) and data members (rno) name is same then use this keyword to refer DM
		this.name = name;
		this.std = std;
		
		System.out.println("local variable value assigned to DM");
		
		System.out.println("Exit from parametrized constructor");
	} // para constructor
	
	
	//two argument constructor
	public TestStudent(int rno, String name) {
		System.out.println("Entry in parametrized constructor");
		
		this.rno = rno; // when local variable (rno) and data members (rno) name is same then use this keyword to refer DM
		this.name = name;
//		this.std = std;
		
		System.out.println("local variable value assigned to DM");
		
		System.out.println("Exit from parametrized constructor");
	} // para constructor
	
	
	//copy constructor
	
	public TestStudent(TestStudent s) {
		System.out.println("Entry in copy constructor");
		
		this.rno = s.rno;
		this.name = s.name;
		this.std = s.std;
		
		System.out.println("Exit from copy constructor");
	}
	
	
	
	
	public void scanData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter roll no.: ");
		rno = sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("Enter name: ");
		name = sc.nextLine();
		
		System.out.println("Enter std: ");
		std = sc.nextInt();
		
	}
	
	public void displayData() {
		System.out.println(rno+" "+name+" "+std);
	}

	
	
	// setters 
	
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
	// getters
	
	//if file doesn't have main method then it cannot be run, but we can access this class Student from another file of same package 
}
