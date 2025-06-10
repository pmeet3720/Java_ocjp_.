package exception.types;

public class MultipleCatchBlockExceptions {
	
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
			ans = no1/no2;
			
			int[] a = new int[5];
			a[1] = 15;
			
			String name = null;
			System.out.println(name.charAt(10));
			
			
		}catch(ArithmeticException e) {
			System.out.println("Catch block handled: "+e.getMessage());
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Catch block handled: "+e.getMessage());
		}catch(Exception e) {
			System.out.println("Catch block handled: "+e.getMessage());
		}
		System.out.println("Result: "+ans);
		System.out.println("Statement--6-----------");
		System.out.println("Statement--7-----------");
		System.out.println("Statement--8-----------");
		System.out.println("Statement--9-----------");
		System.out.println("Statement--10-----------");
	}

}
