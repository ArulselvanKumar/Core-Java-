package overriding;

public class Manager extends Employee {
	
	void CalculateSalary(){
		System.out.println("Manager Salary = 50,000");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager M = new Manager();
		M.CalculateSalary();

	}

}
