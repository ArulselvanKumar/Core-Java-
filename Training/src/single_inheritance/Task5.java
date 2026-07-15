package single_inheritance;

class shape{
	void shp() {
		System.out.println("Print Shape");
	}
}
class circle extends shape{
	void cir() {
		System.out.println("print Circle");
	}
	
}

public class Task5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		circle c =new circle();
		c.shp();
		c.cir();

	}

}
