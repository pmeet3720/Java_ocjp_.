package oops.abstractiontopic.task.task1;

public class PublicPlace extends Person {
	
	@Override
	public void getBehave() {
		System.out.println("Public Place -- getBehave() -- citizen");
	}
	
	public void getPublicEvents() {
		System.out.println("Public Place -- getPublicEvent() -- get public events");
	}

}
