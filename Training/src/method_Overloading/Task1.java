package method_Overloading;

public class Task1 {
	void printelements(int[] arr) {
		for(int i=0; i< arr.length;i++) {
			System.out.println(arr[i]);
			
		}
	}
		void printelements(String[] arr) {
			for(int i=0; i<arr.length;i++) {
				System.out.println(arr[i]);
				
			}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Task1 str = new Task1();
		int[] numbers = {10,30,40,50};
		String[] name1 = {"Arul", "Karthi", "Selva", "kumar", "Kavi"};
		str.printelements(numbers);
		str.printelements(name1);
	}

}