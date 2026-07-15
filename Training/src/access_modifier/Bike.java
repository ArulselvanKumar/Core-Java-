package access_modifier;

public class Bike {
	void Royal() {
		System.out.println("RE");
	}
public class vehicle{
	 void twowheeler() {
		System.out.println("Scooty");
	}
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike b =new Bike();
		Vehicle v = new Vehicle();

		b.Royal();
		v.twowheeler();

	}

}
