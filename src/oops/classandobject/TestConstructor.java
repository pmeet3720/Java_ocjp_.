package oops.classandobject;

public class TestConstructor {
	
	public static void main(String[] args) {
		
		System.out.println("START: MAIN MEHTOD");
		
		
		//default constructor implementation
		// TestStudent cobj = new TestStudent();
		
		//cobj is reference variable of class type - TestStudent
		
		// new - keyword -- tells jvm to create a object named cobj of type TestStudent
		
        // when an object is created then it calls a default constructor at time of creation
		
		
		TestStudent cobj = new TestStudent(1,"Kabir");
		
		System.out.println(cobj.getRno()+" "+cobj.getName()+" "+cobj.getStd());
		
		TestStudent cobj2 = new TestStudent(cobj);
		
		System.out.println("Copy constructor values");
		
		System.out.println(cobj2.getRno()+" "+cobj2.getName()+" "+cobj2.getStd());
		
		System.out.println("EXIT: MAIN MEHTOD ");
	}

}
