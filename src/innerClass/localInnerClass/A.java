package innerClass.localInnerClass;

public class A {
	
	private int no = 100;
	
	public void dispData() {
		
		//local inner class -- inside member function
		class B{
			public void show() {
				System.out.println("B --- show --> N0:"+no);
			}
		}
		
		B objB = new B();
		objB.show();
	}
	
	public static void main(String[] args) {
		A objA = new A();
		objA.dispData();
	}

}
