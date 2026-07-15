package access_modifier;

public class Vehicle {
	public void twowheeler() {
		System.out.println("Scooty");
	}
public static void main (String[] args) {
	Vehicle v = new Vehicle();
	v.twowheeler();
}
}
