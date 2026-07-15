package constructor_Task;

public class Car {
	Car(String Brand, int Model, long Price){
		System.out.println("Brand"+"\t"+"Model"+"\t"+"Price");

		System.out.println(Brand+"\t"+Model+"\t"+Price);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c = new Car("Maruti",2023,400000);

	}

}
