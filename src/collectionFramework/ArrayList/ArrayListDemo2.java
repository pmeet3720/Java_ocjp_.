package collectionFramework.arrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo2 {
	
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("Rahul");
		list.add("Priya");
		list.add("Kabir");
		list.add("Neha");
		list.add("Sarita");
		list.add("Manish");
		list.add("Kirtan");
		
		Iterator<String> itr = list.iterator();
		
		while(itr.hasNext()) {
			String name = itr.next();
			System.out.println(name);
		}
	}

}
