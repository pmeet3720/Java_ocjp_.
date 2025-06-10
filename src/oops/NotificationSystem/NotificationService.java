package oops.NotificationSystem;

import java.util.Scanner;
public class NotificationService {
	
	public static void notifyUser(Notification notify, String msg) 
	{
		notify.sendMsg(msg);
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("1__Email Notification");
		System.out.println("2__SMS Notification");
		System.out.println("3__Push Notification");
		System.out.println("4__exit");
		
		System.out.println("Enter choice: ");
		int choice = sc.nextInt();
		
		Notification notify = null;
		
		switch (choice) {
		case 1:
			notify = new EmailNotification("pmeet134@gmail.com");
			notifyUser(notify,"Your order will be delivered this sunday!");
			break;
			
		case 2:
			notify = new SmsNotification("8849764323","meetpatel");
			notifyUser(notify,"Please contact your delivery agent for any delivery related query");
			break;
			
		case 3:
			notify = new PushNotification("meetpatel","382421");
			notifyUser(notify,"Share the otp with your delivery boy once you recieved the order.");
			break;
			
		case 4:
			System.exit(0);

		default:
			break;
		}
		
		
	}

}
