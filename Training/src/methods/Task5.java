package methods;

public class Task5 {
	public void StarPattern() {
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Task5 Str = new Task5();
		Str.StarPattern();
		
	}

}
