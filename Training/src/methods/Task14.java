package methods;

public class Task14 {
	public int FactorialNum() {
		int num = 5;
		int fact =1;
		for(int i=1; i<=num; i++) {
			fact = fact*i;
		}
		return fact;
	}

	public static void main(String[] args) {
		Task14 FN = new Task14();
		System.out.println(FN.FactorialNum());
	}

}
