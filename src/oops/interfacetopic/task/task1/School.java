package oops.interfacetopic.task.task1;

public class School implements Person {
	
	@Override
	public void getBehave() {
		System.out.println("School -- getBehave() -- student");
	}
	
	public void getResult() {
		System.out.println("School -- getResult() -- result obtained");
	}

}
