package abstract_class;

abstract class Appliance{
	abstract void turnon();
}
class WashingMachine extends Appliance{
	void turnon() {
		System.out.println("Washoing Machine turn on");
	}
}
class Refrigerator extends Appliance{
	void turnon() {
		System.out.println("Refrigerator turn on");
	}
}
public abstract class Task6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WashingMachine w = new WashingMachine();
		Refrigerator r = new Refrigerator();
		w.turnon();
		r.turnon();
		

	}

}
