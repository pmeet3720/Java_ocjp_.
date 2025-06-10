package stringproblems;

public class CheckIfCharIsPresentOrNot {
	
	public static void main(String[] args) {
		String name = "Meet Patel";
		String lower = name.toLowerCase();
		
	    if(lower.contains("p")) {
	    	System.out.println("character p is present");
	    }else {
	    	System.out.println("not present");
	    }
	    
//	    StringBuilder str = new StringBuilder("Hello, Good Morning!");
//	    str.toString().toLowerCase();
	    
	    
//	    str.insert(5, "true");
//	    System.out.println(str);
	}

}
