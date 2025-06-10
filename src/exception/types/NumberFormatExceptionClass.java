package exception.types;

public class NumberFormatExceptionClass {
	
	public static void main(String[] args) {
		String num = "12tH34";
		
		try {
			int num1 = Integer.parseInt(num);
			System.out.println(num1);
		}catch(NumberFormatException e) {
			System.out.println(e.getMessage());
		}
	}

}
