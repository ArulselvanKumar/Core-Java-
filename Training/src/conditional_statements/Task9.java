package conditional_statements;

public class Task9 {

	public static void main(String[] args) {
		// 11. Create a simple calculator using switch case
		
		int a=30;
		int b=50;
		char Addition= '+';
		char subtraction= '-';
		char Multiply= '*';
		char division='/';
		
		
		switch(division) {
		case '+':
			System.out.println("addition=" +(a+b));
			break;
		case '-':
			System.out.println("Subtraction=" +(a-b));
			break;
		case '*':
			System.out.println("Multiply=" +(a*b));
			break;
		case '/':
			System.out.println("divison=" +(a/b));
			break;
			default:
				System.out.println("Error");
		}
	}

}

