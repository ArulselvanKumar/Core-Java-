package map;

import java.util.HashMap;

public class ProductId_ProductName {
	//Display all keys from a map
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> n = new HashMap<>();
		n.put(1, "Soap");
		n.put(3, "Shampoo");
		n.put(5, "ball");
		n.put(6, "Brush");
		n.put(2, "pen");
		for(Integer k:n.keySet()) {
			System.out.println(k);

		}
		
System.out.println("------------");

		//Display all Values from a map
		
		for(String j:n.values()) {
			System.out.println(j);

		}
System.out.println("------------");
		//Check whether a key exists
	
		int L= 5;
		if(n.containsKey(L)) {
			System.out.println("Yes Exists");
		}else {
			System.out.println("Does not Exists");

		}
System.out.println("------------");
		//count the Total entries in a map

		System.out.println(n.size());

		
	}

}
