package string.immutable;

public class StringMethods {
	
	public static void main(String[] args) {
		String name1 = "royal";
		String name2 = "technosoft";
		
		String name3 = name1.concat(" ");
		String name4 = name3.concat(name2);
		
		System.out.println(name4);
		System.out.println(name1+" "+name2);
		
		System.out.println(name2.toUpperCase());
		
//		String casename = "mEEt";
//		System.out.println(casename.toLowerCase());
		
		//substring
		String str = "Royal Technosoft Private Limited.";
		System.out.println(str.substring(6));
		System.out.println(str.substring(6, 16));
		
		StringBuffer s1 = new StringBuffer("Quiz"); StringBuffer s2 = s1.reverse(); 
		System.out.println(s2);
		
		
		String str1 = " ";
		if(str1.isEmpty()) {
			System.out.println("String is empty");
		}else {
			System.out.println("String is not empty");
		}
		
		
		
		String casename1 = "mEEt";
		String casename2 = "meet";
		
		if(casename1.compareTo(casename2) == 0) {
			System.out.println("Both names are same");
		}else {
			System.out.println("Both names are not same");
		}
		
		if(casename1.compareToIgnoreCase(casename2) == 0) {
			System.out.println("Both names are same");
		}else {
			System.out.println("Both names are not same");
		}
	}

}
