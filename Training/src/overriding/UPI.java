package overriding;

public class UPI extends Payment{
	void Pay() {
		System.out.println("UPI");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UPI U = new UPI();
		U.Pay();

	}

}
