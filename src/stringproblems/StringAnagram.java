package stringproblems;

public class StringAnagram {
	
	public static void sortString(char ch[]) {
		int k[] = new int[ch.length];
		int tmp=0;
		
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
		StringBuilder str1 = new StringBuilder("listen");
		StringBuilder str2 = new StringBuilder("silent");
		StringBuilder newStr1= new StringBuilder(),newStr2= new StringBuilder();
		
		char ch1[] = str1.toString().toCharArray();
		char ch2[] = str2.toString().toCharArray();
		
		sortString(ch1);
		
		sortString(ch2);
		
		for(int i=0;i<ch1.length;i++) {
		    newStr1.append(ch1[i]);
		}
		
		for(int i=0;i<ch2.length;i++) {
		    newStr2.append(ch2[i]);
		}
		
		if(newStr1.toString().equals(newStr2.toString()) == true) {
			System.out.println("string is anagrams");
		}else {
			System.out.println("string is not anagram");
		}
		
	}

}
