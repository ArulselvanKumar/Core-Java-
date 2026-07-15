package overriding;


class BankName {
	void InterestRates() {
		System.out.println("Interest Rate");
	}
}
class DBS extends BankName{
	void InterestRates() {
		System.out.println("DBS Interest Rate");
	}
}
		
class KVB extends DBS{
			void InterestRates() {
				System.out.println("KVB Interest Rate");
			}
}



public class task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		KVB s = new KVB();
		s.InterestRates();

	}

}
