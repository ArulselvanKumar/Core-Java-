package single_inheritance;

class mobile{
	void samsung() {
		System.out.println("Samsung Mobile");
	}
}

class Smartphone extends mobile{
	void brand() {
		System.out.println("Samsung Brand");

	}
}

public class Task6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Smartphone s = new Smartphone();
		s.samsung();
		s.brand();

	}

}
