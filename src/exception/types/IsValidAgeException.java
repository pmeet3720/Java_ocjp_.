package exception.types;


//user defined checked exception -- is compile time exception and parent class of compile
//time exception is -- Exception
//public class IsValidAgeException extends Exception {
//	
//	public IsValidAgeException(String msg) {
//		super(msg);
//	}
//
//}


//unchecked exception -- runtime exception parent class
public class IsValidAgeException extends RuntimeException {
	
	public IsValidAgeException(String msg) {
		super(msg);
	}

}
