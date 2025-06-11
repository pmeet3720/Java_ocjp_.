package exception.types;

import java.util.Scanner;
public class CheckedExceptionRaise {
	
	//throw keyword is used to raise Exception
	//throws keyword is used to declare Exception when method is declared
	
	public static void isValidAgeForVote(int age) throws ArithmeticException {
		if(age < 18) {
			
			//raise exception:
			//          1. checked           2. Unchecked
			
			
			//raise checked exception
//			throw new IOException("\nInvalid Age\n\tEnter correct age.");
			
			//raise unchecked exception
			throw new ArithmeticException("\nInvalid Age\n\tEnter correct age.");
		}else {
			System.out.println("Welcome for vote");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int age;
		System.out.println("Enter age: ");
		age = sc.nextInt();
		
		try {
			isValidAgeForVote(age);
		}catch(ArithmeticException e) {
			e.printStackTrace();
		}
		
		System.out.println("======After exception handled======");
		
		
	}

}
