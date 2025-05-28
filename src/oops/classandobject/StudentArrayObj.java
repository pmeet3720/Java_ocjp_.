package oops.classandobject;

public class StudentArrayObj {
	
	public static void main(String[] args) {
		
		TestStudent s[] = new TestStudent[5]; // creates 5 references of an object
		
		for(int i=0;i<s.length;i++) {
			s[i] = new TestStudent();
			s[i].scanData();
		}
		for (int i = 0; i < s.length; i++) {
			
			s[i].displayData();
			
		}
		
	}

}
