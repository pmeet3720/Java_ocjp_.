package exception.types.methodOverride;

public class A {
	
	//rule 1: if parent class doesn't throw any exception then it's child should not throw
	//any exception, child class can throw unchecked exception
	
	
	//rule 2: if parent throws checked exception then it's child class can throw 
	
	public void test() throws Exception {
		
	}

}
