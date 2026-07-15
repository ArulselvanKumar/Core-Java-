package conditional_loop;

public class Task1 {

	public static void main(String[] args) {
		// check whether a number is prime
		int num=13;
		int count=0;
		for(int i=1; i<=num;i++) {
			if(num%i ==0 ) {
				count++;
			}
		}
		if(count==2) {
			System.out.println("Prime number");
		}else {
			System.out.println("Not a prime number");
		}
	}

}
