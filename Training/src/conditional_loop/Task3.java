package conditional_loop;

public class Task3 {

	public static void main(String[] args) {
		//3. Print fibonacci series upto N terms
		int n=7;
		int a=0, b=1;
		for(int i=1;i<=n;i++) {
			System.out.println(a+"");
			int c = a+b;
			a=b;
			b=c;
		}

	}

}
