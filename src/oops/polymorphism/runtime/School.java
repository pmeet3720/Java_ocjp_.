package oops.polymorphism.runtime;

public class School extends Person {
	
	@Override
	public void getBehave() {
		System.out.println("School -- getBehave() -- student");
	}
	
	public void getResult() {
		System.out.println("School -- getResult() -- result obtained");
	}

}
