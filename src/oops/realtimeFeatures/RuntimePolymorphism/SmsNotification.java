package oops.realtimeFeatures.RuntimePolymorphism;

public class SmsNotification extends Notification {
	private String phoneNumber;
	
	public SmsNotification() {
		
	}
	
	public SmsNotification(String recipientName, String message, String phoneNumber) {
		super(recipientName, message);
		this.phoneNumber = phoneNumber;
	}
	
	@Override
	public void send() {
		System.out.println("Sending SMS to "+recipientName+" at "+phoneNumber+" with message "+message);
	}

}
