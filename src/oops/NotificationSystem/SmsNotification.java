package oops.NotificationSystem;

public class SmsNotification implements Notification {
	
	private String mobileNum;
	private String username;
	
	public SmsNotification(String mobileNum,String username) {
		this.username = username;
		this.mobileNum = mobileNum;
	}
	
	@Override
	public void sendMsg(String msg) {
		System.out.println("Hello user: "+username+"\n"+msg+": "+mobileNum);
	}

}
