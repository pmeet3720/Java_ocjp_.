package collectionFramework.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetClass {
	public static void main(String[] args) {
		LinkedHashSet<String> linkedSetObj = new LinkedHashSet<String>();
		
		linkedSetObj.add("Meet");
		linkedSetObj.add("Kabir");
		linkedSetObj.add("Krunal");
		linkedSetObj.add("Neha");
		linkedSetObj.add("Sarita");
		linkedSetObj.add("Neha");
		linkedSetObj.add("Sarita");
		linkedSetObj.add("Neha");
		linkedSetObj.add("Sarita");
		linkedSetObj.add("Shruti");
		linkedSetObj.add("Ganesh");
		
		System.out.println("List.size(): "+linkedSetObj.size());

		
		Iterator<String> itr = linkedSetObj.iterator();
		
		while(itr.hasNext()) {
			String s = itr.next();
			
			System.out.println(s);
		}
	}
}
