package single_inheritance;

	class Person{
		String name = "Arul";
		int a = 27;
	void details() {
		System.out.println("Name ="+ name);
		System.out.println("Age="+a);
	}
}
	class Employee extends Person{
		
	}

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee E = new Employee();
		E.details();

	}

}
