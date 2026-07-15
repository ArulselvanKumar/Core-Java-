package interface_task;

interface Flyable{
	void fly();
}
class Bird implements Flyable{
	public void fly() {
		System.out.println("Birds are flying");
	}
}
class Aeroplane implements Flyable{
	public void fly() {

		System.out.println("Aeroplane flying");

}
}
public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aeroplane a = new Aeroplane();
		Bird b = new Bird();
		a.fly();
		b.fly();

	}

}
