package set;

import java.util.TreeSet;

public class Treeset {
	//Alphabetical order

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> k = new TreeSet<String>();
		k.add("varun");
		k.add("kevin");
		k.add("sridhar");
		k.add("dinesh");
		k.add("madhan");
		System.out.println(k);
		for(String j:k) {
			System.out.println(j);
		}

	}

}
