package multilevel_inheritance;
class vehicle extends car{
	void bike() {
		System.out.println("Royal Enfield");
	}
}  
class car extends sportscar{
	void model() {
		System.out.println("swift");
	}
}
class sportscar {
	void variant() {
		System.out.println("F1");
	}
}

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		vehicle sc = new vehicle();
		sc.variant();
		sc.model();
		sc.bike();
		
	}

}
