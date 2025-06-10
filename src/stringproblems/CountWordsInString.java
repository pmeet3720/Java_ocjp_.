package stringproblems;

public class CountWordsInString {
	
	public static void main(String[] args) {
		String str;
		System.out.println("enter string: ");
		str = new java.util.Scanner(System.in).nextLine();
		
		String words[] = str.split("\\s");
		
		for (int i = 0; i < words.length; i++) {
			System.out.println("words["+i+"]: "+words[i]);
		}
		
		System.out.println("Number of words: "+words.length);
	}

}
