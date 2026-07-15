package interface_task;

interface printable{
	void print();
}
class document implements printable{
	public void print() {
		System.out.println("Printing Document");
	}
}

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		document d = new document();
		d.print();

	}

}
