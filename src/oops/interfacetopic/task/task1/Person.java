package oops.interfacetopic.task.task1;

public interface Person {
	
	//implementing interface task -- interface is (pure abstraction) -- 100% 
	
	//interface child has 3 options -- 
	//1.It can be declared with interface keyword
	//2.It can be declared with abstract keyword
	//3.It can be default class
	public abstract void getBehave();
	
	//DM's are declared as public static final by default by compiler
	int NO = 10; //  constant variable
	
	// 3 ways to declare the methods in interface class -- 
	//static method / default method / private method
	
	static void test1() {
		System.out.println("Person -- static -- test1()");
	}
	
	default void test2() {
		System.out.println("Person -- default -- test2()");
		test3();
	}
	
	private void test3() {
		System.out.println("Person -- private -- test3()");
	}

}
