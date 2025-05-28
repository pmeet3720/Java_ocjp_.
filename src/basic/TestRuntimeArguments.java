package basic;

public class TestRuntimeArguments {
	
	public static void main(String[] args) {
		for(String value: args) {
			System.out.println(value);
		}
	}

}
