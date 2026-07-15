package abstract_class;
abstract class Hospital{
	abstract void treatment();
}
class DentalHospital extends Hospital{
	void treatment() {
		System.out.println("Teeth Checkup");
	}
}
class EyeHospital extends Hospital{
	void treatment() {
		System.out.println("Eye Checkup");
	}
}
public abstract class Task8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DentalHospital D = new DentalHospital();
		EyeHospital E = new EyeHospital();
		D.treatment();
		E.treatment();

	}

}
