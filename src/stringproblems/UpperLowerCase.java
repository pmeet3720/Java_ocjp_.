package stringproblems;

public class UpperLowerCase {
	
	public static void main(String[] args) {
		String str;
		
		System.out.println("Enter string: ");
		str = new java.util.Scanner(System.in).nextLine();
		
		System.out.println("Lower(): "+str.toLowerCase());
		System.out.println("Upper(): "+str.toUpperCase());
	}

}
