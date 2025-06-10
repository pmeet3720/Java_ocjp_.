package oops.NotificationSystem;

public class EmailNotification implements Notification{
	
	private String email;
	
	public EmailNotification(String email) {
		this.email = email;
	}
	
	@Override
	public void sendMsg(String msg) {
		System.out.println("Hello user: "+email+"\n"+msg);
	}

}
