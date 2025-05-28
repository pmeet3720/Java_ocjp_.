package basic;

import java.util.Scanner;
public class TestAppCalculator {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("---------Calculator---------");
		int no1,no2,add,sub,mul,div,mod;
		System.out.println("Enter no1: ");
		no1 = sc.nextInt();
		System.out.println("Enter no2: ");
		no2 = sc.nextInt();
		
		String op;
		while(true) {
			System.out.println("+___Addition");
			System.out.println("-___Subtraction");
			System.out.println("*___Multiplication");
			System.out.println("/___Division");
			System.out.println("%___Modulus");
			System.out.println("Enter character operator: ");
			op = sc.next();
			
			switch(op) {
			case "+":
				add = no1+no2;
				System.out.println("Addition: "+add);
			    break;
			case "-":
				sub = no1-no2;
				System.out.println("Subtraction: "+sub);
				break;
			case "*":
				mul = no1*no2;
				System.out.println("Multiplication: "+mul);
				break;
			case "/":
				div = no1/no2;
				System.out.println("Division: "+div);
				break;
			case "%":
				mod = no1%no2;
				System.out.println("Modulus: "+mod);
				break;
			default:
				System.exit(0);
			}
		}
		
	}

}
