package overriding;

public class HDFC extends Bank{
	void InterestRate() {
		System.out.println("HDFC Interest Rate");

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HDFC H = new HDFC();
		H.InterestRate();

	}

	}


