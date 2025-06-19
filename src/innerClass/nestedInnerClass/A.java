package innerClass.nestedInnerClass;

public class A {
	
	private static int no = 100;
	
	static class B{
		void dispData() {
			System.out.println("B--dispData() No: "+no);
		}
	}
	
	public static void main(String[] args) {
		
		A.B obj = new B();
		obj.dispData();
		
	}

}
