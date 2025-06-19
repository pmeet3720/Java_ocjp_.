package innerClass.anonymousInnerClass;

public class TestApp1 {
	
	public static void main(String[] args) {
		
		//2. anonymous inner class - no need to create a child class for parent abstract class
		//we can override test1() method inside anonymous class as done below -- no name
		//but work is defined
		A objA = new A()
		{
			@Override
			public void test1() {
				System.out.println("A --- test1()");
				
			}
		};
		
		objA.test1();
	}

}
