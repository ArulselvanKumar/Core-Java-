package while_Loop;

public class Task9 {

	public static void main(String[] args) {
		//10. check whether a number contains digit 5
		int num=9865216;
	
		while(num>0) {
			int a=num%10;
			if(a==5) {
				System.out.println("Given number contains digit 5");
				break;

			}
			num=num/10;
		}
		System.out.println("Given number does not contains digit 5");

	}

}
