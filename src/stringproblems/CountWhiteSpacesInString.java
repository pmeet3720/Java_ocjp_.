package stringproblems;

public class CountWhiteSpacesInString {
	
	public static void main(String[] args) {
		StringBuilder str = new StringBuilder("    My name is Meet Patel  ");
		StringBuilder str1 = new StringBuilder("");
		System.out.println(str);
		str.trimToSize();
		char ch[] = str.toString().toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if(ch[i] == ' ') {
//				String.valueOf(ch[i]);
//				str.deleteCharAt(i);
			}else {
				str1.append(ch[i]);
			}
		}
		System.out.println(str1);
		
	}

}
