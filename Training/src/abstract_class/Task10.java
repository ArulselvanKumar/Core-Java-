package abstract_class;
abstract class Payment{
	abstract void payamount();
}
class CreditCardPayment extends Payment{
	void payamount() {
		System.out.println("creditcard");
	}
	
}
class UPIPayment extends Payment{
	void payamount() {
		System.out.println("UPI");
	}
}


public abstract class Task10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UPIPayment u = new UPIPayment();
		CreditCardPayment c = new CreditCardPayment();
		u.payamount();
		c.payamount();


	}

}
