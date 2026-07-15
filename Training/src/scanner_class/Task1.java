package scanner_class;

import java.util.Scanner;

public class Task1 {
	public void Numbers() {
		Scanner obj = new Scanner(System.in);
		int a = obj.nextInt();
		System.out.println(a);
	}

	public static void main(String[] args) {
		Task1 N = new Task1();
		N.Numbers();
	}

}
