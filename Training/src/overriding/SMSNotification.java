package overriding;

public class SMSNotification {
	void Notification() {
		System.out.println("Notification SMS");
	}

public static void main(String[] args) {
	SMSNotification S = new SMSNotification();
	S.Notification();
}

}
