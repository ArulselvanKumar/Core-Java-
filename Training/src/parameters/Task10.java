package parameters;

public class Task10 {
	void calculateArea(int a) {
		int area = a*a;
		System.out.println(area);
	}

	public static void main(String[] args) {
		Task10 obj = new Task10();
		obj.calculateArea(4);
	}

}
