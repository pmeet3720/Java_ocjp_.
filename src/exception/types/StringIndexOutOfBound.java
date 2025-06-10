package exception.types;

public class StringIndexOutOfBound {
	
	public static void main(String[] args) {
		String name = "Meet";
		
		try {
			System.out.println(name.charAt(5));
		}catch(StringIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
	}

}
