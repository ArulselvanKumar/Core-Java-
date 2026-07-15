package scanner_class;

import java.util.Scanner;

public class Task14 {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		int b = obj.nextInt();
		int sum=0;
		for(int i=1;i<=b;i++) {
			sum=sum+i;
		}
		System.out.println(sum);

	}

}
