package map;

import java.util.HashMap;

public class SpecificStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		HashMap<String,Integer> k = new HashMap<>();
		k.put("Kevin",60);
		k.put("ravi",30);
		k.put("jai",50);
		k.put("vicky",70);
		k.put("krish",65);
		
		//Find the mark of a specific student using the key
		System.out.println(k.get("jai"));
		
		//Remove a key-value pair from a Map
		System.out.println(k);
		
		k.remove("vicky");
		System.out.println(k);

		
		

	}

}
