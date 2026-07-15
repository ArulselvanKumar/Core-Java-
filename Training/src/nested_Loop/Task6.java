package nested_Loop;

public class Task6 {

	public static void main(String[] args) {
		//6.print multiplication tables from 1 to 10
		for (int i=1;i<=10;i++) {
			
			for(int j=1;j<=10;j++) {
				System.out.println(i+"*"+j+"="+(i*j));
				
			}
			System.out.println();
		}
	}

}
