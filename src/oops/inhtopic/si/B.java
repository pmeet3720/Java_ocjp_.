package oops.inhtopic.si;

// scope ------ extends
public class B extends A{
	
	private int no2;
	
	public static void main(String[] args) {
		B obj = new B();
		obj.no1 = 10;
		obj.no2 = 20;
		System.out.println("no1: "+obj.no1+" "+"no2: "+obj.no2);
	}

}
