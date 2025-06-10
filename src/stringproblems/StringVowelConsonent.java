package stringproblems;

public class StringVowelConsonent {
	
	public static void main(String[] args) {
		String str = "Royal Technosoft Private Limited";
		int vow=0,con=0;
		
		char str1[] = str.toLowerCase().toCharArray();
		
		for(char c:str1) 
		{
			if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') 
			{
				vow++;
			}else {
				con++;
			}
		}
		
		System.out.println("Vowels: "+vow+"\n"+"Consonants: "+con);
	}

}
