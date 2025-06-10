package string.mutable;

public class TestApp1 {
	
	public static void main(String[] args) {
		String str1 = "royal";
		String str2 = "techno";
		
		str1.concat(str2); //immutable way method, it will not change value of str1
		
		System.out.println("str1: "+str1);
		System.out.println("str2: "+str2);
		
		StringBuffer sb1 = new StringBuffer("meet");
		StringBuffer sb2 = new StringBuffer("patel");
		
		sb1.append(sb2); //mutable way method, it changes value of string in existing sb1
		
//		StringBuffer sb3 = sb1.append(sb2);
//		
//		System.out.println("sb1: "+sb1.hashCode());
//		System.out.println("sb3: "+sb3.hashCode());

	}

}
