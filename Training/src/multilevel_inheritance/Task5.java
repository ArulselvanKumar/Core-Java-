package multilevel_inheritance;

class BankAccount extends SavingsAccount{
	void open() {
		System.out.println("New Bank Account");
	}
}
class SavingsAccount extends CurrentAccount{
	void SB() {
		System.out.println("Savings Account");
	}
}
class CurrentAccount{
	void sc() {
		System.out.println("current Account");
	}
}
	

public class Task5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount BA = new BankAccount();
		BA.open();
		BA.SB();
		BA.sc();

	}

}
