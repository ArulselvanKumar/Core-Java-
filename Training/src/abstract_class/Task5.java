package abstract_class;

abstract class animal{
	abstract void sound(); 
}

class dog extends animal{
	void sound() {
		System.out.println("Dog Barks");
	}
}
class cat extends animal{
	void sound() {
		System.out.println("Cat Meow");
	}
}
class cow extends animal{
	void sound() {
		System.out.println("cow Moo");
	}
}
public abstract class Task5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dog d = new dog();
		cat c = new cat();
		cow w = new cow();
		d.sound();
		c.sound();
		w.sound();
		

	}

}
