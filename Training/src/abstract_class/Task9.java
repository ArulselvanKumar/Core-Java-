package abstract_class;

abstract class Mobile{
	abstract void features();
}
class Vivo extends Mobile{
	void features() {
		System.out.println("Good life");
	}
	
}
class samsung extends Mobile{
	void features() {
		System.out.println("Top Brand");
	}
}

public abstract class Task9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vivo v = new Vivo();
		samsung s = new samsung();
		v.features();
		s.features();

	}

}
