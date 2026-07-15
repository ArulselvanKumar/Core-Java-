package single_inheritance;

class BankAccount{
	void bank() {
		System.out.println("Canara");
	}
}
 class SavingsAccount extends BankAccount{
	void savings() {
		System.out.println("Open Savings Account");
	}
}

public class Task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SavingsAccount SA = new SavingsAccount();
			SA.bank();
			SA.savings();

			
		

	}

}
