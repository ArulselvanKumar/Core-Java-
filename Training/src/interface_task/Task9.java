package interface_task;

interface Notification {
	void sendNotification();
}
class EmailNotification implements Notification{
	public void sendNotification() {
		System.out.println("Alert SendNotification");
	}
	
}
class SMSNotification implements Notification{
	public void sendNotification() {
		System.out.println("Alert SMSNotification");

}}
public class Task9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmailNotification e = new EmailNotification();
		SMSNotification s = new SMSNotification();
		e.sendNotification();
		s.sendNotification();


	}

}
