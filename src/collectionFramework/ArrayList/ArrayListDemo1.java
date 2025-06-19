package collectionFramework.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.stream.Stream;

public class ArrayListDemo1 {
	
	public static void main(String[] args) {
		
		//Dynamic Array
		ArrayList List = new ArrayList();
		
		List.add(true); // boolean---0---[Boolean--object]
		List.add(12); //int ---1---[Integer--object]
		List.add(17L); //long---2---[Long--object]
		List.add(34.56f); //float---3---[Float--object]
		List.add(45.567); //double---4---[Double--object]
		List.add("Meet"); //String---5---[String]
		List.add('K');//char---6---[Character--object]
		
		Student s = new Student(101,"Kabir",12);
		
		List.add(s);
		
/*		for(int i=0;i<List.size();i++) {
			
			Object obj = List.get(i);
			
			if(obj instanceof Student) {
				Student s1 = (Student)obj;
				System.out.println("List.get("+i+"): "+s1.getRno()+" "+s1.getName()+" "+s1.getStd());
			}else {
				System.out.println("List.get("+i+"): "+obj);
			}
			
			
		}
*/
//---------------------------------------------------------------------------------------------
		//using forEach, AdvancedForLoop, EnhancedForLoop
/*		for(Object obj:List) 
		{
			if(obj instanceof Student) {
				Student s1 = (Student)obj;
				System.out.println(s1.getRno()+" "+s1.getName()+" "+s1.getStd());
			}else {
				System.out.println(obj);
			}
		}
*/
		
//----------------------------------------------------------------------------------------
		//using Traditional way
		
/*		Iterator itr = List.iterator();
		
		while(itr.hasNext()) {
			Object obj = itr.next();
			if(obj instanceof Student) {
				Student s1 = (Student)obj;
				System.out.println(s1.getRno()+" "+s1.getName()+" "+s1.getStd());
			}else {
				System.out.println(obj);
			}
			
		}
*/
		
		//stream api way
		
		Stream s1 = List.stream();
		
		s1.forEach(obj -> System.out.println(obj));
		
	}

}
