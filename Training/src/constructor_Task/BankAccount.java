package constructor_Task;

public class BankAccount {
	
	 long Account;
	 long B;

	BankAccount(long AccountNumber, long Balance){
		this.Account=AccountNumber;
		this.B=Balance;
	}
	
	void display() {
		System.out.println(Account+"\n"+B);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount b = new BankAccount(54643256789675l, 20000);

		b.display();

	}

}
