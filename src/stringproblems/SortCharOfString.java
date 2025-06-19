package stringproblems;

public class SortCharOfString {
	
	public static void sortCharOfString(char[] ch) {
		int tmp;
		int k[] = new int[ch.clone().length];
		
		for(int i=0;i<ch.length;i++) {
			k[i] = (int)ch[i];
		}
		
		for(int i=0;i<ch.length;i++) {
			for(int j=0;j<ch.length-1-i;j++) {
				if(k[j] > k[j+1]) {
					tmp = k[j];
					k[j] = k[j+1];
					k[j+1] = tmp;
				}
			}
		}
		
		for(int i=0;i<ch.length;i++) {
			ch[i] = (char)k[i];
		}
	}
	
	public static void main(String[] args) {
		
		StringBuilder str = new StringBuilder("fedcba");
		
		char[] ch = str.toString().toCharArray();
		
		sortCharOfString(ch);
		
		for(int i=0;i<ch.length;i++) {
			System.out.print(ch[i]);
		}
		
	}

}
