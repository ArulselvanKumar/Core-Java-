package map;

import java.util.HashMap;
import java.util.Map;

public class Iterate_entryset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Iterate through a map using EntrySet()
		
		HashMap<Integer, String> n = new HashMap<>();
		n.put(1, "Soap");
		n.put(3, "Shampoo");
		n.put(5, "ball");
		n.put(6, "Brush");
		n.put(2, "pen");
		for(Map.Entry<Integer,String>entry:n.entrySet()) {
			System.out.println(entry.getKey());

			System.out.println(entry.getValue());

		
		}
		

	}

}
