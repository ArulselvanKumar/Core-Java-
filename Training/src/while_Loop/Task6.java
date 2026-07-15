package while_Loop;

public class Task6 {

	public static void main(String[] args) {
		// 6. Print Each digit of a number
		int num = 123456;
		int a=0;
		
		while(num>0) {
			a=a*10+(num%10);
			num=num/10;
		}
		while(a>0) {
			System.out.println(a%10);
			a=a/10;
		}

	}

}
