package scanner_class;
import java.util.Scanner;

public class Task8 {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		int age = obj.nextInt();
		if(age>18) {
			System.out.println("You are Eligible for vote");
		}else
		{
			System.out.println("You are Not Eligible for vote");

		}
				
	}

}
