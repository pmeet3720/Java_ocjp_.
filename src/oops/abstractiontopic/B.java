package oops.abstractiontopic;

public abstract class B extends A{
	int no2;
	public B() {
		this.no2 = 20;
		System.out.println("Default--B");
	}
	
	public abstract void test3();
	
	public void test4() {
		System.out.println("B-----test4");
	}

}
