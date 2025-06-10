package stringproblems;

public class CountUpperLowerDigitSpecial {
	
	public static void main(String[] args) {
		String str = "RCB becomes champion of IPL @2025";
		int uCase=0,lCase=0,digit=0,sp=0;
		
		char[] ch = str.toCharArray();
		
		for(char c:ch) {
			if(c >= 'a' && c <= 'z') {
				lCase++;
			}else if(c >= 'A' && c <= 'Z') {
				uCase++;
			}else if(c >= '0' && c <= '9') {
				digit++;
			}else {
				sp++;
			}
		}
		System.out.println("Count of lower case: "+lCase+"\n"+"Count of Upper case: "+uCase+"\n"+"Count of digit: "+digit+"\n"+"Count special: "+sp);
	}
}
