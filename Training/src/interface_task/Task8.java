package interface_task;

interface Drawable{
	void draw(int r);
}

class circle implements Drawable{
	public void draw(int r) {
		double c = 3.14+r+r;
		System.out.println(c);
	}
	
}
class square implements Drawable{
	public void draw(int a) {
		int d = a*a;
		System.out.println(d);
	}

}
public class Task8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		square s = new square();
		circle c = new circle();
		s.draw(10);
		c.draw(4);
	}

}
