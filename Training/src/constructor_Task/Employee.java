package constructor_Task;

public class Employee {
	Employee(int empId,String empName, int Salary){
		System.out.println(empId+"\t"+empName+"\t"+Salary);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e = new Employee(1,"kavin",10000);
		Employee m = new Employee(2,"sathish",30000);


	}

}
