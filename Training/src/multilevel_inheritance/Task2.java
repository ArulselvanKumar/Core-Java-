package multilevel_inheritance;

class person{
	void name() {
		System.out.println("Arul");
	}
}
class Employee extends person{
	int age = 27;
	String name = "Arul";
	String Gender = "Male";
	void details() {
		System.out.println("age");
		System.out.println("name");
		System.out.println("Gender");
	}
}

class manager extends Employee{
	void manage() {
		System.out.println("Approved");
	}
}
public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		manager m = new manager();
		m.details();
		

	}

}
