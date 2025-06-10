package oops.realtimeFeatures.RuntimePolymorphism;

public class Notification {
	
	//base class
	
	//DMs
	protected String recipientName;
	protected String message;
	
	//constructors
	public Notification() {
		
	}
	
	public Notification(String recipientName, String message) {
		this.recipientName = recipientName;
		this.message = message;
	}
	
	//member function
	public void send() {
		System.out.println("Send method to be overriden in each child class");	
	}

}
