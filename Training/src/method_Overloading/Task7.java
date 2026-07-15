package method_Overloading;

public class Task7 {
	void search(int[] array, int values) {
		for(int i=0; i<array.length;i++) {
			if(array[i]==values) {
				System.out.println("Found");
				return;
			}
		}
		System.out.println("Not found");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Task7 f= new Task7();
		int[] n = {10,20,40,50};
		f.search(n,80);

	}

}
