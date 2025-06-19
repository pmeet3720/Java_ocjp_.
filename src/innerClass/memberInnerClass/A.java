package innerClass.memberInnerClass;

public class A {
	
	//1. member inner class
	
	private int no = 100;
	
	//member inner class-B
	class B{
		public void show() {
			System.out.println("Show()---method of member inner class No: "+no);
		}
	}
	
	public static void main(String[] args) {
		
		//class-A objA
		A objA = new A();
		
		//class-B objB
		B objB = objA.new B();
		
		objB.show();
	}

}
