package multilevel_inheritance;
class Animal{
	void eat() {
		System.out.println("Eat");
	}
}

class dog extends Animal{
	void bark() {
		System.out.println("Barks");
	}
}
class puppy extends dog{
	void bite() {
		System.out.println("bite");
	}
}
public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		puppy obj = new puppy();
		obj.bite();
		obj.bark();
		obj.eat();

	}
	

}
