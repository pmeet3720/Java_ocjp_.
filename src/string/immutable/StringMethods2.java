package string.immutable;

public class StringMethods2 {
	
	public static void main(String[] args) {
		String str = "Royal Technosoft Private Limited";
		
		System.out.println("startsWith: "+str.startsWith("Royal")+" EndsWith: "+str.endsWith("Limited"));
		
		System.out.println(str.indexOf("Technosoft"));
		
		String name = str.substring(0, 6);
		
		char str1[] = name.toCharArray();
		for(char c:str1) {
			System.out.println(c);
		}
		
		String name1 = "royal";
		String name2 = new String("royal").intern(); //it checks it name1 is there in constant pool and compares it's value with object present in ACP or heap
		System.out.println(name1 == name2);
		
		String strno1 = String.valueOf(10);
		String strno2 = String.valueOf(20);
		System.out.println("strno1: "+strno1+" strno2: "+strno2);
		
		int no1 = Integer.parseInt(strno1);
		int no2 = Integer.parseInt(strno2);
	}

}
