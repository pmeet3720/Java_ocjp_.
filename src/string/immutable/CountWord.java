package string.immutable;

public class CountWord {
	
	public static void main(String[] args) {
		String str;
		System.out.println("enter string: ");
		str = new java.util.Scanner(System.in).nextLine();
		String word;
		
		int cnt=0;
		for (int i = 0; i < str.length(); i++) 
		{
			
			word = "";
			while(str.charAt(i) != ' ' && i<str.length()) {
				word += str.charAt(i);
				
				i++;
			}
			if(word.length()>0) {
				cnt++;
				System.out.println("word: "+word);
			}
			
		}
		
		System.out.println("count: "+cnt);
	}

}
