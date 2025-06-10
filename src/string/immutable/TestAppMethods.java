package string.immutable;

public class TestAppMethods {
	
	public static void main(String[] args) {
		String name1 = "technosoft";
		
		//length of name1
		System.out.println("length of name1: "+name1.length());
		
		//printing each chars
		for (int i = 0; i < name1.length(); i++) {
			
			System.out.println("name1.charAt("+ i +"): "+name1.charAt(i));
			
		}
	}

}
