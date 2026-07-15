package methods;

public class Task4 {
	public void Evennumbers() {
		System.out.println("Print Even numbers form 1 to 20");
		for(int i =1; i<=20; i++) {
			
			if(i%2==0) {
				System.out.println(i);
			}
		}
	}

	public static void main(String[] args) {
		Task4 Even = new Task4();
		Even.Evennumbers();

	}

}
