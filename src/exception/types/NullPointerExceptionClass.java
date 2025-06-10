package exception.types;

public class NullPointerExceptionClass {
	
	public static void main(String[] args) {
		String name = null;
		
		try {
			System.out.println(name.length());
		}catch(NullPointerException e) {
			System.out.println(e.getMessage());
		}
	}

}
