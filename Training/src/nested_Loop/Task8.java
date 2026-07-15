package nested_Loop;

public class Task8 {

	public static void main(String[] args) {
		// Print 3 rows and 3 column as "-" and 2 rows and 2 column as "*"
		for (int i =1; i<=3; i++) {
			for (int j=1; j<=3; j++) {
				System.out.print("-");
			}
			System.out.println();

		}
		for(int i=1; i<=2;i++) {
			for(int j=1; j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
