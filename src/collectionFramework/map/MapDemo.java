package collectionFramework.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;

public class MapDemo {
	
	public static void main(String[] args) {
		
		//map stores data in key:value pair
		
		//HashMap -- [key, value] -- [Not maintain insertion order]
		
		//LinkedHashMap -- [key, value] -- [maintain insertion order]
		
		//TreeMap -- [key, value] -- [sorting with key]
		
		LinkedHashMap<Integer, String> linkedMapObj = new LinkedHashMap<Integer, String>();

		HashMap<Integer, String> mapObj = new HashMap<Integer, String>();
		
		mapObj.put(1,"Meet");
		mapObj.put(2,"Kabir");
		mapObj.put(7,"Vraj");
		mapObj.put(3,"Kunal");
		mapObj.put(4,"Sarita");
		mapObj.put(6,"Dev");
		mapObj.put(5,"Sejal");
		
		for(Map.Entry<Integer, String> e:mapObj.entrySet()) {
			// e -- [key, value]
			System.out.println(e.getKey()+": "+e.getValue());
		}

	}

}
