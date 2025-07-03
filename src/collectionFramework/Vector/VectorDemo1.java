package collectionFramework.vector;

import java.util.Iterator;
import java.util.Vector;

public class VectorDemo1 {
	
	public static void main(String[] args) {
		Vector<String> list = new Vector<String>();
		
		list.add("Meet");
		list.add("Kabir");
		list.add("Krunal");
		list.add("Neha");
		list.add("Sarita");
		list.add("Shruti");
		list.add("Ganesh");
		
		System.out.println("List.size(): "+list.size());

		
		Iterator<String> itr = list.iterator();
		
		while(itr.hasNext()) {
			String s = itr.next();
			
			System.out.println(s);
		}
	}
}
