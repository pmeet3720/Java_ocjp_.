package stringproblems;

public class LongestWordInString {
	
	public static void main(String[] args) {
		StringBuilder str = new StringBuilder("mom saw a racecar and said wow!");
		
		String word[] = str.toString().split("\\s");
		String longestWord = "";
		int len=0,max=word[0].length(),i=0,j=0;
		
		for(i=0;i<word.length;i++) {
			len = word[i].length();
			if(len > max) {
				max = len;
				longestWord = word[i];
			}
			System.out.println(word[i]);
			
		}
		
		System.out.println("longest word: "+longestWord);
				
	}

}
