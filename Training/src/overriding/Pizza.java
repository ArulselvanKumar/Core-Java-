package overriding;

public class Pizza extends Food {
	void taste() {
		System.out.println("You select Pizza");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pizza P = new Pizza();
		P.taste();

	}

}
