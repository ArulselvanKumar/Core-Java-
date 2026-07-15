package method_Overloading;

public class Task3 {
	void averageElements(int[] num){
		int sum = 0;
		for(int i=0; i<num.length;i++) {
			sum= sum+num[i];
		}
		double average =(double)sum/num.length;
		System.out.println(average);

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Task3 n = new Task3();
		int[] avg = {20,30,40,60};
		n.averageElements(avg);

	}

}
