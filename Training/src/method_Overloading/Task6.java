package method_Overloading;

public class Task6 {
	void CountEvenodd(int[] result) {
		int Even = 0;
		int odd = 0;
		for(int i=0; i<result.length;i++) {
			if(result[i]%2==0) {
				Even++;
			}else
				odd++;
		}
		System.out.println(Even);
		System.out.println(odd);

		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Task6 Eo = new Task6();
		int[] value = {4,5,2,7,3};
		Eo.CountEvenodd(value);

	}

}
