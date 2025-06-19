package stringproblems;

public class CheckIfStringContainsOnlyAlphabet {
	
	public static void main(String[] args) {
		StringBuilder str = new StringBuilder("Meet2025");
		
		char ch[] = str.toString().toLowerCase().toCharArray();
		boolean flag = true;
		
		for(char c: ch) {
			if(!(c >= 'a' && c <= 'z')) {
				flag = false;
			}
		}
		
		if(!flag) {
			System.out.println("False, string contains not only alphabets");
		}else {
			System.out.println("True, string contains only alphabets");
		}
	}

}
