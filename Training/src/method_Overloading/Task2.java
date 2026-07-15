package method_Overloading;

public class Task2 {
	void sumofelements(int [] num) {
		int sum=0;
		for(int i=0; i<num.length ;i++)
		{
			sum=sum+num[i];
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Task2 s = new Task2();
		int[] elements = {30,40,10,20};
		s.sumofelements(elements);

	}

}
