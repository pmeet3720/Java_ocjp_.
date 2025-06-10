package oops.abstractiontopic;

public abstract class A {
	
	int no1;
	String name;
	
	public A() {
		this.no1 = 10;
		this.name = "Meet";
		System.out.println("Default -- A");
	}
	
	
	public abstract void test1();
	
	public void test2() {
		System.out.println("A----test2");
	}

}
