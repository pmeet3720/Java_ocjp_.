package exception.types;

import java.util.Scanner;

public class UserDefinedCheckedUnchekedException {
	
	public static void isValidAgeForVote(int age) throws IsValidAgeException {
		if(age < 18) {
			//checked exception -- user defined exception
			
			throw new IsValidAgeException("\nInvalid Age\n\tplease enter correct age");
		}else {
			System.out.println("Welcome for vote");
		}
	}
	
	public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
		
		int age;
		System.out.println("Enter age: ");
		age = sc.nextInt();
		
		try {
			isValidAgeForVote(age);
		}catch(IsValidAgeException e) {
			e.printStackTrace();
		}
		
		System.out.println("======After exception handled======");
		
	}

}
