package while_Loop;

public class Task4 {

	public static void main(String[] args) {
		// 4.check whether a number is a palindrome
		int num=123454321;
		int reverse=0;
		int b =num;
		while(num!=0) {
			int a = num%10;
			reverse= reverse*10+a;
			num=num/10;
		}
		if(b==reverse) {
			System.out.println(b+"=number is a palindrome");
		}else {
			System.out.println(b+"=number is not a palindrome");
		}
		

	}

}
