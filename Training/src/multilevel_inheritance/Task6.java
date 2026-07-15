package multilevel_inheritance;
class shape extends circle{
	void s() {
		System.out.println("Shape");
		
	}
}
class circle extends ColoredCircle{
	void c() {
		System.out.println("Circle");
	}
}
class ColoredCircle{
	void CC() {
		System.out.println("Colored Circle");
	}
}

public class Task6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 shape obj = new shape();
	 obj.s();
	 obj.c();
	 obj.CC();

	}

}
