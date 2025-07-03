package collectionFramework.arrayList;

import java.util.ArrayList;

public class ArrayListDemo4 {
	
	public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
		
		list.add("Rahul");
		list.add("Priya");
		list.add("Kabir");
		list.add("Neha");
		list.add("Sarita");
		list.add("Manish");
		list.add("Kirtan");
		
		System.out.println(list);
		
		list.remove(1);
		System.out.println(list);
		
		list.set(2, "Krunal");
		System.out.println(list);
	}

}
