package interface_task;

interface payment{
	void makepayment();
}

class googlePay implements payment{
	public void makepayment() {
		System.out.println("Paid by googlePay");
	}

	
}

class PhonePay implements payment{
	public void makepayment() {
		System.out.println("Paid by PhonePay");

	}

	
}
class Paytm implements payment{
	public void makepayment() {
		System.out.println("Paid by Paytm");

}
}

public class Task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Paytm p = new Paytm();
		PhonePay h = new PhonePay();
		googlePay g = new googlePay();
		p. makepayment();
		h.makepayment();
		g.makepayment();
		
	}
}

