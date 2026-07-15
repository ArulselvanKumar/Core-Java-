package parameters;

public class Task26 {
	void bookTicket(int seats, String classtype, String Mealtype) {
		System.out.println(seats);
		System.out.println(classtype);
		System.out.println(Mealtype);


	}
	
public static void main(String[]args) {
	Task26 s = new Task26();
	s.bookTicket(17,"Second","veg");
}

}
