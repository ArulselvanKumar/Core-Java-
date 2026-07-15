package methods;

public class Task10 {
	public void EvenOdd(){
		int num = 24;
		if(num%2==0) {
			System.out.println("Given number is Even");
		}else
			System.out.println("Given number is odd");
	}

	public static void main(String[] args) {
		Task10 EO = new Task10();
		EO.EvenOdd();
	}

}
