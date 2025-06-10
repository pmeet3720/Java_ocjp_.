package stringproblems;

public class StringIsEmpty {
	
	public static void main(String[] args) {
		String name = "";
		
		if(name.isEmpty()) {
			System.out.println("please enter your name it is empty: ");
			name = new java.util.Scanner(System.in).nextLine();
		}else {
			System.out.println("name is not empty");
			System.out.println("Name: "+name);
		}
	}

}
