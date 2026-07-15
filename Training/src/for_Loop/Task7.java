package for_Loop;

public class Task7 {

	public static void main(String[] args) {
		// 9. Find the sum of even number 1 to 100
		int i=1;
		int sum=0;
		for(i=1;i<=100;i++) {
			if(i%2==0) {
				sum = sum+i;
			}
		}
		System.out.println("Sum of even number 1 to 100 is \t"+ sum);
		
		// 10. Find the sum of odd number 1 to 100
		int j=1;
		int num=0;
		for(j=1;j<=100;j++) {
			if(j%2!=0) {
				num = num+j;
			}
		}
		System.out.println("Sum of odd number 1 to 100 is \t"+ num);


	}

}
