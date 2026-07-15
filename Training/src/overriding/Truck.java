package overriding;


import access_modifier.Vehicle;

public class Truck {
	void container() {
		System.out.println("contain");
	}
public class vehicle{
	 void twowheeler() {
		System.out.println("Scooty");
	}
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Truck T =new Truck();
		Vehicle v = new Vehicle();

		T.container();
		v.twowheeler();

	}

}
