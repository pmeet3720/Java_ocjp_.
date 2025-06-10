package oops.interfacetopic.task.task1;

public class Org implements Person{
	
	@Override
	public void getBehave() {
		System.out.println("Org -- getBehave() -- employee");
	}
	
	public void getSalary() {
		System.out.println("Org -- getSalary() -- salary obtained");
	}

}
