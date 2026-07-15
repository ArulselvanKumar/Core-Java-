package method_Overloading;

public class Task4 {
	void LargestElement(int[] a) {
		int largest = a[0];
		for(int i =0; i<a.length; i++) {
			if(a[i]>largest) {
				largest =a[i];
			}
		}
		System.out.println(largest);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Task4 l = new Task4();
		int[] num = {12,70,30,50,80,40};
		l.LargestElement(num);

	}

}
