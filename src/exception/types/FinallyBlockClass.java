package exception.types;

public class FinallyBlockClass {
	
	public static void main(String[] args) {
		int no1,no2;
		System.out.println("enter no1: ");
		no1 = new java.util.Scanner(System.in).nextInt();
		System.out.println("enter no2: ");
		no2 = new java.util.Scanner(System.in).nextInt();
		
		System.out.println("Statement--1-----------");
		System.out.println("Statement--2-----------");
		System.out.println("Statement--3-----------");
		System.out.println("Statement--4-----------");
		System.out.println("Statement--5-----------");
		
		int ans = 0;
		try {
			//if u want to execute all codes inside try block then use nested try-catch blocks
			try {
				ans = no1/no2;
			}catch(ArithmeticException e) {
				e.printStackTrace();
			}

			
			try {
				int[] a = new int[5];
				a[1] = 15;
			}catch(ArrayIndexOutOfBoundsException e) {
				e.printStackTrace();
			}
			
			try {
				String name = null;
				System.out.println(name.charAt(10));
			}catch(NullPointerException e) {
				e.printStackTrace();
			}
			
			
		}catch(ArithmeticException e) {
			System.out.println("Catch block handled: "+e.getMessage());
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Catch block handled: "+e.getMessage());
		}catch(Exception e) {
			System.out.println("Catch block handled: "+e.getMessage());
		}finally {
			System.out.println("========Finally Block========");
		}
		
		
		System.out.println("Result: "+ans);
		System.out.println("Statement--6-----------");
		System.out.println("Statement--7-----------");
		System.out.println("Statement--8-----------");
		System.out.println("Statement--9-----------");
		System.out.println("Statement--10-----------");
	}

}
