package oops.statictopic;

public class TestStudent {
	
	public static void main(String[] args) {
		Student s1 = new Student(100,"Meet",12);
		Student s2 = new Student(101,"Dev",11);
		Student s3 = new Student(102,"Prashant",10);
		Student s4 = new Student(103,"Raghav",12);
		
		Student.setSchoolName("Tapovan Interantional School");
		
		s1.dispData();
		s2.dispData();
		s3.dispData();
		s4.dispData();
	}

}
