package stringproblems;

public class CompareToStrings {
	
	public static void main(String[] args) {
		String str1 = "Meet";
		String str2 = new String("Meet");
		String str3 = str1;
		
		System.out.println(str1.equals(str2));
		if(str1.compareTo(str2)==0) { //checks based on reference, since str1 and str2 are different instances
			System.out.println("Strings are not equal");
		}else {
			System.out.println("Strings are equal");
		}
		
		if(str1.compareTo(str3)==0) { //checks based on reference, since str1 and str2 are different instances
			System.out.println("Strings are not equal");
		}else {
			System.out.println("Strings are equal");
		}
	}

}
