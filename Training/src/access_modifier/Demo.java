package access_modifier;

public class Demo {
	public int a = 100;
	private int b = 200;
	         int c = 300;
	protected int d = 400;
	void Test() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo D = new Demo();
		System.out.println(D.a);
		System.out.println(D.b);
		System.out.println(D.c);
		System.out.println(D.d);
		D.Test();


		

	}

}
