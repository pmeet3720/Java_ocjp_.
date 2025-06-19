package stringproblems;

public class SwapFirstandLastCharInString {
	
	public static void main(String[] args) {
		StringBuilder str = new StringBuilder("Hello sir, here is my problem");
		
		char first = str.toString().charAt(0);
		int lastIndex = str.length()-1;
		char last = str.toString().charAt(str.length()-1);
		
//		System.out.println(first+" "+last);
		
//		int tmp = (int)first;
//		first = last;
//		last = (char)tmp;
		
		str.replace(0, 1, String.valueOf(last));
		str.replace(lastIndex, lastIndex+1, String.valueOf(first));
		System.out.println("Length: "+str.length());
		
		System.out.println(str);
//		System.out.println(first+" "+last);
		
		
	}

}
