package scanner_class;

import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {
			Scanner n = new Scanner(System.in);
			int Num = n.nextInt();
			if(Num >0) {
				System.out.println("Given Number is positive");
			}else if(Num<0) {
				System.out.println("Given Number is Negative");

			}else {
				System.out.println("Given Number is Zero");

			}
	}

}
