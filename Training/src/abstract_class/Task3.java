package abstract_class;

	abstract class Employee{
	abstract void calculatesalary();
	
}
class FullTimeEmployee extends Employee{
		void calculatesalary() {
			System.out.println("20,000");
		}
	}
class PartTimeEmployee extends Employee{
	void calculatesalary() {
		System.out.println("10,000");
	}
}
public abstract class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FullTimeEmployee F = new FullTimeEmployee();
		PartTimeEmployee P = new PartTimeEmployee();
		F.calculatesalary();
		P.calculatesalary();
		
	}

}
