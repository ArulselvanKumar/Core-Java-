package while_Loop;

public class Task1 {

	public static void main(String[] args) {
		// 1. Reverse a number
		int a = 123456789;
		int reverse=0;
		System.out.println("Given number is ="+ a);
		while(a!=0) {
			int num = a%10;
			reverse = reverse *10 + num;
			a=a/10;
		}
		System.out.println("Reverse Numbers is=" + reverse);
	}

}
