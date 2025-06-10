package oops.executionflow;

public class A {
	
	//static block
	static 
	{
		System.out.println("STATIC ----- BLOCK ----- 1");
	}
	
	//static block
	static 
	{
		System.out.println("STATIC ----- BLOCK ----- 2");
	}
	
	//static method
	public static void staticMehtod()
	{
		System.out.println("STATIC ------ METHOD");
	}
	
	//instance block
	{
		System.out.println("INSTANCE ----- BLOCK ----- 1");
	}
	
	//instance block
	{
		System.out.println("INSTANCE ----- BLOCK ----- 2");
	}
	
	//default constructor
	public A() 
	{
		System.out.println("DEFAULT ----- CONSTRUCTOR");
	}
	
	//parametrized constructor
	public A(int no) 
	{
		this();
		System.out.println("PARAMETRIZED ------- CONSTRUCTOR");
	}
	
	//non-static method
	public void nonStaticMethod()
	{
		System.out.println("NON STATIC ------- METHOD");
	}
	
	public static void main(String[] args) {
		System.out.println("START----MAIN");
		
		A.staticMehtod();
		A obj1 = new A(10);
		A obj2 = new A(9);
		
		obj1.nonStaticMethod();
		
		System.out.println("EXIT----MAIN");
	}

}
