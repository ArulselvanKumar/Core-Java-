package interface_task;

interface vehicle{
	void methoddrive();
}
class car implements vehicle{
	public void methoddrive() {
		System.out.println("Drive a car");
	}
 
}
class  bike implements vehicle{
	public void methoddrive() {
		System.out.println("Drive a Bike");

	}
}
public class Task5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		car c =new car();
		bike b = new bike();
		c.methoddrive();
		b.methoddrive();

	}

}
