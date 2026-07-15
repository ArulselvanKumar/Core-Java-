package methods;

public class Task15 {
	public int ReverseNumber() {
		int original=45678;
		int reverse=0;
		while(original>0) {
			int num = original %10;
			reverse = reverse *10 + num;
			original=original/10;
		}
		return reverse;
	}

	public static void main(String[] args) {
		Task15 RN = new Task15();
		System.out.println(RN.ReverseNumber());
	}

}
