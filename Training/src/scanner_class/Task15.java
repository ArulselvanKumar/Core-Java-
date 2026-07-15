package scanner_class;

import java.util.Scanner;

public class Task15 {
	public static void main(String[]args) {
		Scanner F = new Scanner(System.in);
		int num1= F.nextInt();
		int fact = 1;
		for(int i=1;i<=num1;i++) {
			fact = fact*i;
		}
		System.out.println(fact);

	}
}
