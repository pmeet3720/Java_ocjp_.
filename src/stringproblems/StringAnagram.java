package stringproblems;

public class StringAnagram {
	
	public static int countCharOccur(char ch, String name) {
		int cnt = 0;
		
		char nameArr[] = name.toCharArray();
		
		for(char c:nameArr) {
			if(ch == c) {
				cnt++;
			}
		}
		return cnt;
	}
	
	public static boolean isAlreadyCounted(char ch[], char currChar, int currIndex) {
		
		for(int i=0;i<currIndex;i++) {
			if(ch[i] == currChar) {
				return true;
			}
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		StringBuilder str1 = new StringBuilder("listen");
		StringBuilder str2 = new StringBuilder("silent");
		
		char ch1[] = str1.toString().toCharArray();
		char ch2[] = str2.toString().toCharArray();
		
		if(ch1.length == ch2.length) {
			for(int i=0;i<ch1.length;i++) {
				
			}
		}
		
	}

}
