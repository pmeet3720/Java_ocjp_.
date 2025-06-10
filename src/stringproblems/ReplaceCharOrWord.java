package stringproblems;

public class ReplaceCharOrWord {
	
	public static void main(String[] args) {
		
		StringBuilder str = new StringBuilder("Royal Technosoft is a training center");
		
		str.replace(17, str.length(), "Private Limited");
		System.out.println(str);
		
		String name = "My name is Meet";
		String newName = name.replace("Meet", "Kabir");
		System.out.println(newName);
	}

}
