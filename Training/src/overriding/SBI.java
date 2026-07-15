package overriding;

public class SBI extends Bank {
		void InterestRate() {
			System.out.println("SBI Interest Rate");
		}
	
public static void main(String[] args) {
	// TODO Auto-generated method stub
	SBI S = new SBI();
	S.InterestRate();

}

}
