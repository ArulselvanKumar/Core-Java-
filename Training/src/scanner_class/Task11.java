package scanner_class;

import java.util.Scanner;

public class Task11 {

	public static void main(String[] args) {
			Scanner obj = new Scanner(System.in);
			int Table = obj.nextInt();
			System.out.println("Table of"+ Table);

			for(int i=1; i<=10;i++) {
				System.out.println(i+"*"+Table+"="+i*Table);
			}
	}

}
