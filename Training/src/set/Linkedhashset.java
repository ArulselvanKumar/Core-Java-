package set;

import java.util.LinkedHashSet;

public class Linkedhashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<String> l = new LinkedHashSet<String>();
		l.add("Bike");
		l.add("Car");
		l.add("Van");
		l.add("Truck");
		System.out.println(l);
		for(String m:l) {
			System.out.println(m);
		}
		
		

	}

}
