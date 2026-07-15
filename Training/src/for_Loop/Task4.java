package for_Loop;

public class Task4 {

	public static void main(String[] args) {
		// 6. Find the Factorial of a num
		int n=10;
		int factorial =1;
		for(int i=1; i<=n;i++) {
			factorial= factorial*i;
		}
		System.out.println("Factorial of"+ n +"=" + factorial);

	}

}
