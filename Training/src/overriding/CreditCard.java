package overriding;

public class CreditCard extends Payment {
	void Pay() {
		System.out.println("Credit card");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CreditCard c = new CreditCard();
		c.Pay();

	}

}
