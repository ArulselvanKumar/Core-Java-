package abstract_class;

 abstract class Vehicle {
	abstract void start();
	void stop()
	{
		System.out.println("Vehicle stop");
	}
}

class car extends Vehicle{
	void start() {
		System.out.println("start Car ");
}
}

class bike extends Vehicle{
	void start() {
		System.out.println("start Bike ");
}

}
public class Task1{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		car c = new car();
		c.start();
		c.stop();
		
		bike b =new bike();
		b.start();
		b.stop();
	}

}
