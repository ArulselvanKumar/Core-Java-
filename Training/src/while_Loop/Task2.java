package while_Loop;

public class Task2 {

	public static void main(String[] args) {
		// 2.Count the digits in a number
		int a = 123456789;
		int count=0;
		System.out.println("Given number is ="+ a);
		while(a!=0) {
			a = a/10;
			count=count+1;
		}
		System.out.println("Total digit is =" +count);
	}

}
