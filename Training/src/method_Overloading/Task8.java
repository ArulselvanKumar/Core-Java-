package method_Overloading;

public class Task8 {
	void rev(int[] arr){ 
		for(int i=arr.length-1; i>=0; i--) {
			System.out.println(arr[i]);
			
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Task8 reverse = new Task8();
		int[] value = {30,20,10,50};
		reverse.rev(value);

	}

}
