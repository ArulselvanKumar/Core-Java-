package nested_Loop;

public class Task1 {

	public static void main(String[] args) {
		// 1. Print a right triangle star pattern
		
		for(int i=1; i<=6;i++){
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
