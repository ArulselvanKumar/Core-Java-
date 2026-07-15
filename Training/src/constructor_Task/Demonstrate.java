package constructor_Task;

public class Demonstrate {
	
	Demonstrate(){
		System.out.println("Hello");
	}
	Demonstrate(int a){
		System.out.println(a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demonstrate d = new Demonstrate();
		Demonstrate e = new Demonstrate(50);


	}

}
