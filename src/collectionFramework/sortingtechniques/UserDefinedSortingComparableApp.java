package collectionFramework.sortingtechniques;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class UserDefinedSortingComparableApp {
	
	public static void main(String[] args) {
		Student s1 = new Student(101,"Kabir",11,90);
		Student s2 = new Student(102,"Sagar",10,45);
		Student s3 = new Student(103,"Kohli",12,78);
		Student s4 = new Student(104,"Mahesh",9,89);
		Student s5 = new Student(105,"Neha",8,100);
		
		ArrayList<Student> list = new ArrayList<Student>();
		
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);
		
		Iterator<Student> itr = list.iterator();
		
		System.out.println("Before sorting: ");
		
		while(itr.hasNext()) {
			Student s = itr.next();
			System.out.println(s.getRno()+" "+s.getName()+" "+s.getStd());
		}
		
//		System.out.println("After sorting markwise: ");
//		Collections.sort(list);
//		
//		itr = list.iterator();
//		
//		while(itr.hasNext()) {
//			Student s = itr.next();
//			System.out.println(s.getRno()+" "+s.getName()+" "+s.getStd()+" "+s.getMarks());
//		}
		
//		System.out.println("After sorting namewise: ");
//		Collections.sort(list);
//		
//		itr = list.iterator();
//		
//		while(itr.hasNext()) {
//			Student s = itr.next();
//			System.out.println(s.getRno()+" "+s.getName()+" "+s.getStd()+" "+s.getMarks());
//		}
		
		System.out.println("After sorting Stdwise: ");
		Collections.sort(list);
		
		itr = list.iterator();
		
		while(itr.hasNext()) {
			Student s = itr.next();
			System.out.println(s.getRno()+" "+s.getName()+" "+s.getStd()+" "+s.getMarks());
		}
	}

}
