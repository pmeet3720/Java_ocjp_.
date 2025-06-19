package stringproblems;

public class CheckStringIsPalindromeOrNot {
	
	public static void main(String[] args) {
		StringBuilder str = new StringBuilder("racecar");
		
		char[] ch = str.toString().toCharArray();
		boolean flag = true;
		
		for(int i=0,j=ch.length-1;i<=j;i++,j--) {
			if(ch[i] != ch[j]) {
				flag = false;
				break;
			}
		}
		
		if(!flag) {
			System.out.println("string is not palindrome");
		}else {
			System.out.println("string is palindrome");
		}
	}

}
