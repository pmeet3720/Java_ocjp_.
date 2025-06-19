package stringproblems;

public class reverseEachWordInString {
	
	public static void reverseWord(String orig) {
		
		char ch[] = orig.toCharArray();
		
		for(int j=orig.length()-1;j>=0;j--) {		
			System.out.print(orig.charAt(j));
		}
		System.out.println();

	}
	
	public static void main(String[] args) {
		StringBuilder str = new StringBuilder("Hello mister, how are you!");
		
		String word[] = str.toString().split("\\s");
		
		for(String orig:word) {
//			System.out.println(orig);
			reverseWord(orig);
		}
	}

}
