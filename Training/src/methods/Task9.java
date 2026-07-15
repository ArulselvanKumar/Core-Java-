package methods;

public class Task9 {
	public void MultiplicationTable() {
		int num = 7;
		for(int i=1; i<=10; i++) {
				System.out.println(i+"*"+num+"="+i*num);
		}
		
	}

	public static void main(String[] args) {
		Task9 mt = new Task9();
		mt.MultiplicationTable();
	}

}
