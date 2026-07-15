package interface_task;

interface RemoteControl{
	void on();
     void off(); 
	
}
class TV implements RemoteControl{
	public void on() {
		System.out.println("TV on");
	}
   public void off() {
		System.out.println("TV off");

   }

}
class AC implements RemoteControl{
	public void on() {
		System.out.println("AC on");	
}
	   public void off() {
			System.out.println("AC off");
	   }
	   }

public class Task6 {
public static void main (String []args) {
	TV t =new TV();
	AC a = new AC();
	t.on();
	t.off();
	a.on();
	a.off();
}
}
