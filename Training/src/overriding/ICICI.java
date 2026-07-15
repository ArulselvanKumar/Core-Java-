package overriding;

public class ICICI extends Bank{
	void InterestRate() {
		System.out.println("ICICI Interest Rate");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ICICI I = new ICICI();
		I.InterestRate();

	}

}
