package oops.interfacetopic.task.task1;

public class PublicPlace implements Person {
	
	@Override
	public void getBehave() {
		System.out.println("Public Place -- getBehave() -- citizen");
	}
	
	public void getPublicEvents() {
		System.out.println("Public Place -- getPublicEvent() -- get public events");
	}

}
