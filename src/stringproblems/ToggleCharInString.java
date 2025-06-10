package stringproblems;

public class ToggleCharInString {
	
	public static void main(String[] args) {
		
		String str = "Hello developers, how was your DAy";
		String str1 = "";
		
		char[] ch = str.toCharArray();
		
		for(char c:ch) {
			if(c >= 'a' && c <= 'z') {
				int ct = (int)c;
				ct = ct - 32;
//				str1 = str.replace(String.valueOf(c), String.valueOf((char)ct));
				str1 += (char)ct;
			}else if(c >= 'A' && c <= 'Z') {
				int ct = (int)c;
				ct = ct + 32;
//				str1 = str.replace(String.valueOf(c), String.valueOf((char)ct));
				str1 += (char)ct;
			}else {
				String cr = String.valueOf(c);
				str1 += cr;
			}
		}
		
		System.out.println(str1);
		
	}

}
