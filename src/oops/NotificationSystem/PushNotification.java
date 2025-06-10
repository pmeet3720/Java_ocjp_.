package oops.NotificationSystem;

public class PushNotification implements Notification {
	
	private String otp;
	private String username;
	
	public PushNotification(String username, String otp) {
		this.username = username;
		this.otp = otp;
	}
	
	@Override
	public void sendMsg(String msg) {
		System.out.println("Hello user: "+username+"\n"+"Below is your otp: "+"\n"+otp+"\n"+msg);
	}

}
