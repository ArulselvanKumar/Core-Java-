package methods;

public class Task13 {
	public int LargestNumber() {
		
		int a = 40;
		int b = 90;
		int c = 80;
		
		if(a>=b && a>=c) {
			return a;
		}else if(b>=a && b>=c) {
			return b;
		}else {
			return c;

		}

	}
	

	public static void main(String[] args) {
		
		Task13 LN = new Task13();
		System.out.println(LN.LargestNumber());
		

	}

}
