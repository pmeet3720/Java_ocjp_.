package basic;
import java.util.Scanner;

public class TestOperations {
	
	public static void main(String[] args) {
		
		int no1,no2,add,sub,mul,div;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter no1: ");
		no1 = sc.nextInt();
		System.out.println("Enter no2: ");
		no2 = sc.nextInt();
		
		add = no1+no2;
		sub = no1-no2;
		mul = no1*no2;
		div = no1/no2;
		
		System.out.println("Addition: "+add);
		System.out.println("Subtraction: "+sub);
		System.out.println("Multiplication: "+mul);
		System.out.println("Division: "+div);
	}

}
