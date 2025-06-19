package stringproblems;

public class CheckIfStringContainsDigit {
	
	public static void main(String[] args) {
		StringBuilder str = new StringBuilder("2025678");
		
		char[] ch = str.toString().toCharArray();
		boolean flag = true;
		
		for(char c: ch) {
			if(!(c >= '0' && c <= '9')) {
				flag = false;
			}
		}
		
		if(!flag) {
			System.out.println("False, string doesn't contains only digits");
		}else {
			System.out.println("True, string contains only digits");
		}
	}

}
