package collectionFramework.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {
	
	public static void main(String[] args) {
		TreeSet<String> treeSetObj = new TreeSet<String>();
		
		treeSetObj.add("Meet");
		treeSetObj.add("Kabir");
		treeSetObj.add("Krunal");
		treeSetObj.add("Neha");
		treeSetObj.add("Sarita");
		treeSetObj.add("Neha");
		treeSetObj.add("Sarita");
		treeSetObj.add("Neha");
		treeSetObj.add("Sarita");
		treeSetObj.add("Shruti");
		treeSetObj.add("Ganesh");
		
		System.out.println("List.size(): "+treeSetObj.size());

		
		Iterator<String> itr = treeSetObj.iterator();
		
		while(itr.hasNext()) {
			String s = itr.next();
			
			System.out.println(s);
		}
	}

}
