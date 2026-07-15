package abstract_class;

abstract class shape{
	abstract void area();
}
class circle extends shape{
	int radius = 4;
	
	void area() {
		double crc = 3.14*radius*radius;
		System.out.println(crc);
	}
}
class rectangle extends shape{
	int l = 10;
	int b = 5;
	
	void area() {
		int rectangle = l*b;
		System.out.println(rectangle);
	}
}
public abstract class Task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     rectangle r = new rectangle();
     circle c = new circle();
     r.area();
     c.area();
	}

}
