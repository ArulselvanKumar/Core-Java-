package overriding;

public class EmailNotification extends Notification {
		void SendMessage() {
			System.out.println("Message Notification");
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmailNotification E = new EmailNotification();
		E.SendMessage();
		

	}

}
