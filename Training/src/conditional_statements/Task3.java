package conditional_statements;

public class Task3 {

	public static void main(String[] args) {
		//5. check wheather year is a leap year
		
		int year =2032;
		if((year%4==0 && year%100!=0)|| (year %400==0)) {
			System.out.println("yes" + year +  "is a Leap year");
		}else
		{
			System.out.println("No" + year + "is not a Leap year");

		}

	}

}
