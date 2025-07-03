package collectionFramework.arrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo3 {
	
	public static void main(String[] args) {
		Student s1 = new Student(101,"Kabir",12,90);
		Student s2 = new Student(102,"Sagar",12,45);
		Student s3 = new Student(103,"Kohli",12,78);
		Student s4 = new Student(104,"Mahesh",12,89);
		Student s5 = new Student(105,"Neha",12,100);
		
		ArrayList<Student> list = new ArrayList<Student>();
		
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);
		
		Iterator<Student> itr = list.iterator();
		
		while(itr.hasNext()) {
			Student s = itr.next();
			System.out.println(s.getRno()+" "+s.getName()+" "+s.getStd());
		}

	}

}
