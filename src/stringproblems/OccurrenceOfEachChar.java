package stringproblems;

public class OccurrenceOfEachChar {
	
	public static int countCharOccur(char ch, String name) {
		int cnt=0;
		char nameArr[] = name.toCharArray();
		for(char c:nameArr) {
			if(c == ch) {
				cnt++;
			}
		}
		return cnt;
	}
	
	public static boolean isAlreadyCounted(char[] ch, char currChar, int currIndex) {
		
		for (int i = 0; i < currIndex; i++) {
			
			if(ch[i] == currChar) {
				return true;
			}
			
		}
		return false;
	}
	
	public static void main(String[] args) {
		String name = "Meet Patel";
		String lower = name.toLowerCase();
		char ch[] = lower.toCharArray();
		
		for (int i = 0; i < ch.length; i++) {
			if(!isAlreadyCounted(ch,ch[i],i)) {
				int charOcurr = countCharOccur(ch[i],lower);
				System.out.println("Count of "+ch[i]+": "+charOcurr);
			}
		}
		
	}

}
