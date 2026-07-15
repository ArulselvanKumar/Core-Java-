package nested_Loop;

public class Task7 {

	public static void main(String[] args) {
		// 7.Print numbers in reverse triangle format 
		for(int i=6;i>=1; i--) {

			for (int j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println( );

		}
	}

}
