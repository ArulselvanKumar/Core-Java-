package parameters;

public class Task12 {
	public void calculateArea(double radius){
		double area = 3.14*radius*radius;
		System.out.println(area);
	}
	public static void main(String[] args) {
		Task12 obj = new Task12();
		obj.calculateArea(5);

	}

}
