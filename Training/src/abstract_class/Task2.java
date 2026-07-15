package abstract_class;

abstract class Bank{
	abstract double getInterestRate();
}
class SBI extends Bank
{
	double getInterestRate()
	{
		return 5.5;
	}
}
class HDFC extends Bank{
	double getInterestRate()
	{
		return 6.7;
	}
}
class ICICI extends Bank{
	double getInterestRate()
	{
		return 4.5;
	}
}



public abstract class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SBI s = new SBI();
		HDFC h = new HDFC();
		ICICI i = new ICICI();
		
		System.out.println(s.getInterestRate());
		System.out.println(h.getInterestRate());
		System.out.println(i.getInterestRate());

	}

}
