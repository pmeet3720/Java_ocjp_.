package stringproblems;

public class FirstNonRepeatingChar {
	
	public static int countCharOccur(char ch, String name) {
		int cnt=0;
		char nameArr[] = name.toCharArray();
		for(char c:nameArr) {
			if(c == ch) {
				cnt++;
			}
		}
		if(cnt==1) {
			System.out.println(ch);
		}
		return cnt;
	}
	
	public static void main(String[] args) {
		StringBuilder str = new StringBuilder("Hello my name is Meet and I have done my graduation from PDEU");
		String lower = str.toString().toLowerCase();
//		String str1 = "";
		boolean flag = false;
		char[] nonReaptingChar = new char[str.length()];
		
		char ch[] = lower.toCharArray();
		int i=0;
		for(char c:ch) {
			int cnt = countCharOccur(c,lower);
			if(cnt>1) {
				
				
			}else if(cnt==1) {
				flag = true;
				nonReaptingChar[i] = c;
				i++;
			}
			
		}
		
		System.out.println("first non repeating char: "+nonReaptingChar[0]);
	}

}
