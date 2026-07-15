package conditional_statements;

public class Task2 {

	public static void main(String[] args) {
		//2. Find the largest of two numbers
		

		int num1= 10;
		int num2 = 20;
		if(num1>num2) {
			System.out.println("Largest number is num1="+ num1);
		}else {
			System.out.println("Largest number is num2="+ num2);

		}
		
		//3. Find the largest of three numbers
		
		int mark1= 50;
		int mark2=80;
		int mark3=70;
		if(mark1>mark2 && mark1>mark3) {
			System.out.println("Largest number is Mark1="+ mark1);

		}else if(mark2>mark1 && mark2>mark3) {
			System.out.println("Largest number is Mark2="+ mark2);
	}else {
		System.out.println("Largest number is Mark3="+ mark3);

	}
		}
	

	}
