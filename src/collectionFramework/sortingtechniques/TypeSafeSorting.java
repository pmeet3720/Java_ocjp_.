package collectionFramework.sortingtechniques;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TypeSafeSorting {
	
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("Rahul");
		list.add("Priya");
		list.add("Kabir");
		list.add("Neha");
		list.add("Sarita");
		list.add("Ankur");
		list.add("Manish");
		list.add("Kirtan");
		
		Iterator<String> itr = list.iterator();
		
		System.out.println("Before sorting: ");
		
		while(itr.hasNext()) {
			String name = itr.next();
			System.out.println(name);
		}
		
		Collections.sort(list);
		System.out.println("After sorting: ");
		
		itr = list.iterator();
		
		while(itr.hasNext()) {
			String name = itr.next();
			System.out.println(name);
		}
	}

}
