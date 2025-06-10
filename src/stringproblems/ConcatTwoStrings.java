package stringproblems;

public class ConcatTwoStrings {
	
	public static void main(String[] args) {
		String str1 = "Meet";
		String str2 = "Patel";
		
		String fullname = str1.concat(" ".concat(str2));
		
		System.out.println("Full Name: "+fullname);
	}

}
