package collectionFramework.set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
	
	public static void main(String[] args) {
		
		//set has doesn't store duplicate values
		//hashset doesn't follow insertion order.
		HashSet<String> setObj = new HashSet<String>();
		
		setObj.add("Meet");
		setObj.add("Kabir");
		setObj.add("Krunal");
		setObj.add("Neha");
		setObj.add("Sarita");
		setObj.add("Neha");
		setObj.add("Sarita");
		setObj.add("Neha");
		setObj.add("Sarita");
		setObj.add("Shruti");
		setObj.add("Ganesh");
		
		System.out.println("List.size(): "+setObj.size());

		
		Iterator<String> itr = setObj.iterator();
		
		while(itr.hasNext()) {
			String s = itr.next();
			
			System.out.println(s);
		}
	}

}
