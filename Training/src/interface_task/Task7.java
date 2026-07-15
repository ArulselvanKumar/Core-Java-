package interface_task;

interface Calculator{
	 void add(int a, int b);
	 void subtract(int a, int b);
}
class Mycalculator implements Calculator {
	public void add(int a, int b) {
		System.out.println(a+b);
	}
	public void subtract(int a, int b) {
		System.out.println(a-b);

	}
}

public class Task7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mycalculator m = new Mycalculator();
		m.add(55, 45);
		m.subtract(55, 45);

	}

}
