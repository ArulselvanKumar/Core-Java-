package while_Loop;

public class Task5 {
	public static void main(String[]args) {
	//5. check whether a number is an Armstrong number
		int num=153;
		int b=num;
		int sum=0;
		while(num>0) {
			int a=num%10;
			sum=sum+(a*a*a);
			num=num/10;
			
			
		}
	if(sum==b) {
		System.out.println("Given number is Armstrong number");
	}else {
		System.out.println("Given number is not an Armstrong number");
	}
	}

}
