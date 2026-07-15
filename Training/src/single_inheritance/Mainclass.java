package single_inheritance;

	 class Puppy{
	 void sound() {
		System.out.println("puppy sound");
	}
}
	 class Dog extends Puppy{
	 void bark() {
		System.out.println("Dog Barks");
	}
}
	 public class Mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog D =new Dog();
		D.sound();
		D.bark();
		

	}

	}
