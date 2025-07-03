package collectionFramework.sortingtechniques;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TypeSafeSortingApp2 {
	
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(1);
		list.add(90);
		list.add(45);
		list.add(5);
		list.add(60);
		list.add(100);
		list.add(2);
		list.add(80);
		
		Iterator<Integer> itr = list.iterator();
		
		System.out.println("Before sorting: ");
		
		while(itr.hasNext()) {
			int num = itr.next();
			System.out.println(num);
		}
		
		Collections.sort(list);
		System.out.println("After sorting: ");
		
		itr = list.iterator();
		
		while(itr.hasNext()) {
			int num = itr.next();
			System.out.println(num);
		}
	}

}
