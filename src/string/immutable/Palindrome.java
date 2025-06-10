package string.immutable;

public class Palindrome {
	
	public static void main(String[] args) {
		String pal;
		
		
		System.out.println("enter string: ");
		pal = new java.util.Scanner(System.in).nextLine();
		boolean flag = true;
		
		for (int i = 0, j = (pal.length()-1); i < pal.length(); i++, j--) {
			
			if(pal.charAt(i) != pal.charAt(j)) 
			{
				flag = false;
				break;
			}
			
		}
		
		if(flag) {
			System.out.println(pal+" is palindrome.");
		}else {
			System.out.println(pal+" is not palindrome");
		}
	}

}
