package exception.types.methodOverride;

import exception.types.IOException;

public class B extends A {
	
//	Exception Handling with Method Overriding in Java
//
//
//	1) If the superclass method does not declare an exception, 
//		subclass overridden method cannot declare the checked exception 
//		but it can declare unchecked exception.
//
//
//	2) If the superclass method declares an exception, 
//		==>subclass overridden method can declare same, 
//		==>subclass exception 
//		==>or no exception 
//		==>but cannot declare parent exception.
	
//	@Override
//	public void test() throws IOException {
//		
//	}
	
	@Override
	public void test() throws ArithmeticException {
		
	}

}
