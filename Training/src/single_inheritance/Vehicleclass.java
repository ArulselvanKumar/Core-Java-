package single_inheritance;

class Vehicle {
	void start() {
	System.out.println("Start the vehicle");
}
}
	class Car extends Vehicle{
		void stop() {
			System.out.println("Start the car");
		}
	}

public class Vehicleclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c = new Car();
		c.start();
		c.stop();
	

	}
}

