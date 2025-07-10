package string.manupulation;

import java.lang.reflect.Array;

public class Test1 {
	
	public static void main(String[] args) {
		//ways to create string object:
		//1.By String Literal way [RAM --> HEAP --> [SCP--String constant pool] --> verify string objects
		
		String name1 = "meet";
		String name2 = "meet";
		String name3 = "patel";
		String name4 = name1;
//		name3.substring(0)
		
		String name5 = name1.concat(name3);
		name3 = "kabir";
//		name5.re
		
		//object equality
		//1. == (reference based)
		System.out.println(name1 == name2);
		System.out.println(name1 == name3);
		System.out.println(name1 == name4);
		
		System.out.println("------------------------------------------------");
		
		//2. (.equals method) -- value based
		System.out.println(name1.equals(name2));
		System.out.println(name1.equals(name3));
		System.out.println(name1.equals(name4));
//		Array
//		Byte
	}

}
