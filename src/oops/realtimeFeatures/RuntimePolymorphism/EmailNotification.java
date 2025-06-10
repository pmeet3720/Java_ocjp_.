package oops.realtimeFeatures.RuntimePolymorphism;

public class EmailNotification extends Notification {
	
	private String emailAddress;
	
	public EmailNotification() {
		
	}
	
	public EmailNotification(String recipientName, String message, String emailAddress) {
		super(recipientName,message);
		this.emailAddress = emailAddress;
	}
	
	@Override
	public void send() {
		System.out.println("Sending email to "+super.recipientName+" at emailAddress "+emailAddress+" with message "+super.message);
	}

}
