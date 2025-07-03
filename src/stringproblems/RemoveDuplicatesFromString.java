package stringproblems;

public class RemoveDuplicatesFromString {
	
	public static int countCharOccur(char ch, StringBuilder name) {
		int cnt=0;
		char nameArr[] = name.toString().toCharArray();
		for(char c:nameArr) {
			if(ch == c) {
				cnt++;
			}
		}
		return cnt;
	}
	
	public static void main(String[] args) {
		StringBuilder str = new StringBuilder("Meet Patel");
		String lower = str.toString().toLowerCase();
		char[] ch = lower.toCharArray();
		StringBuilder str1 = new StringBuilder(lower);
		int i=0;
		for(char c:ch) {
			int cnt = countCharOccur(c,str1);
			if(cnt>1 && i<str.length()) {
				str.deleteCharAt(i);
				str1.deleteCharAt(i);
			}
			i++;
		}
		
		System.out.println(str1);
	}

}
