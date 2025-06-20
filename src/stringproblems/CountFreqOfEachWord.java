package stringproblems;

public class CountFreqOfEachWord {
	
	public static int countFreqWord(String word, String orig) {
		int cnt = 0;
		
		
		
		
		return cnt;
	}
	
	public static void main(String[] args) {
		StringBuilder str = new StringBuilder("Hello Kabir, How are you, what are you doing kabir, hello hello are you there?");
		
		
		for(int i=0;i<str.length();i++) {
			if((str.charAt(i)>='a' && str.charAt(i)<='z') || (str.charAt(i)>='A' && str.charAt(i)<='Z') || str.charAt(i) == ' ') {
				
			}else {
				str.deleteCharAt(i);
			}
		}
		String words[] = str.toString().split("\\s");
		
		for(String word:words) {
			int cnt = countFreqWord(word,str.toString().toLowerCase());
			System.out.println(word.toLowerCase()+" "+cnt);
		}
	}

}
