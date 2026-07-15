package while_Loop;

public class Task8 {

	public static void main(String[] args) {
		// 8.Find the largest digit in a number
		int num= 6938120;
		int largest=0;
		while(num>0) {
			int a = num%10;
			if (a>largest) {
				largest = a;

			}
			num=num/10;

		}
		System.out.println("Given largest digit numbers is="+ largest);
		
		// 9.Find the smallest digit in a number
		int num1=632984;
		int smallest=9;
		while(num1>0) {
			int b= num1%10;
			if(b<smallest) {
				smallest =b;
			}
			num1=num1/10;
		}
		System.out.println("Given smallest digit numbers is="+ smallest);
	}
	
		

	

}
