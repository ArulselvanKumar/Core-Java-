package conditional_loop;

public class Task5 {

	public static void main(String[] args) {
		// 5. Find the least common multiple of two numbers
		int a= 10;
		int b=18;
		int max=(a>b)?a:b;
		int lcm=max;
		while(true) {
			if(lcm%a==0 && lcm%b==0) {
				System.out.println("lcm=" +lcm);
				break;
			}
			lcm++;
		}
	}

}
