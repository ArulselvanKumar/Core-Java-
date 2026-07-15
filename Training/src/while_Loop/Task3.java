package while_Loop;

public class Task3 {

	public static void main(String[] args) {
		// 3. Find the sum of digits of a number
		int i=1234567;
		int sum=0;
		while(i!=0) {
			int num =i%10;
			sum=sum+num;
			i=i/10;

		}
		System.out.println("Sum of digits of a given number =" + sum);

		}

}
