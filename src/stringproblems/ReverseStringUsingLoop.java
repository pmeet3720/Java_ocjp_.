package stringproblems;

public class ReverseStringUsingLoop {
	
	public static void main(String[] args) {
		String name = "Meet Patel";
		
		char ch[] = name.toCharArray();
		String rev = "";
		
		for(int j=ch.length-1;j>=0;j--) {
			String.valueOf(ch[j]);
			rev = rev + ch[j];
		}
		
//		for(int i=0,j=ch.length-1;j>=0;i++,j--) {
//			char temp = ch[j];
//			ch[j] = ch[i];
//			ch[i] = temp;
//			String.valueOf(ch[i]);
//			rev += ch[i];
//		}
		
//		for(char c:ch) {
//			System.out.println(c);
//		}
		
		System.out.println("Reversed string: "+rev);
	}

}
