package string.manupulation;

public class Test2 {
	
	public static void main(String[] args) {
		//2. By 'new' keyword way [RAM --> HEAP]
		
		String name1 = new String("Meet");
		String name2 = new String("Dev");
		String name3 = new String("Meet");
		String name4 = new String("Kabir");
		String name5 = new String("Dev");
		String name6 = name1;
		
		//object equality
		
		//1. ==(reference based)
		System.out.println(name1 == name2);
		System.out.println(name1 == name3);
		System.out.println(name1 == name4);
		System.out.println(name1 == name6);
		
		System.out.println("--------------------------------------------");
		
		//2. (.equals method)
		System.out.println(name1.equals(name2));
		System.out.println(name1.equals(name3));
		System.out.println(name1.equals(name4));
		System.out.println(name1.equals(name6));
	}

}
