package nested_Loop;

public class Task9 {

	public static void main(String[] args) {
		// 9. Print a pyramid pattern using stars
		int row=4;
		for(int i=1; i<=row;i++) {
			for(int j=i;j<row;j++) {
				System.out.print("- ");
			}
			for(int k=1; k<=(2*i-1);k++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
