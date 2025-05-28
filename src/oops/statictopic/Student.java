package oops.statictopic;

public class Student {
	
	int rollno;
	String name;
	int std;
	static String schoolName; // static data members - can be sharable to all object's references of class
	
	//when class is loaded first it allocates memory to static data member
	//static data members and static method should be accessed with class name
	
	public Student(int rollno, String name, int std) {
		this.rollno = rollno;
		this.name = name;
		this.std = std;
	}
	
	// static method - can only set value for static members
	
	public static void setSchoolName(String schoolName) {
		Student.schoolName = schoolName;
	}
	
	public void dispData() {
		System.out.println("Roll No.: "+rollno+"\n"+"Name: "+name+"\n"+"Std: "+std+"\n"+"School Name: "+schoolName);
		System.out.println();
	}
	
}
