package while_Loop;

public class Task7 {

	public static void main(String[] args) {
		// 7.Find the products of digit of a number
		int num=1234567;
		int a=1;
		while(num>0){
			int b=num%10;
			a=a*b;
			num=num/10;
			
		}
		System.out.println("Product of digit="+ a);
	}

}
