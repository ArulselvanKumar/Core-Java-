package method_Overloading;

public class Task5 {
	void smallestElement(int[] c) {
		int smallest = c[0];
		for(int i =0; i<c.length; i++) {
			if(c[i] < smallest){
				smallest = c[i];
			}
		}
		System.out.println(smallest);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Task5 s = new Task5();
		int[] num= {20,10,40,50,30};
		s.smallestElement(num);

	}

}
