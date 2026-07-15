package set;

import java.util.HashSet;

public class TwoSets {
	//common Elements between two sets

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> h = new HashSet<String>();
		HashSet<String> i = new HashSet<String>();
		
		h.add("varun");
		h.add("kevin");
		h.add("sridhar");
		h.add("dinesh");
		h.add("madhan");
		i.add("vicky");
		i.add("sathish");
		i.add("vijay");
		i.add("vikram");
		i.add("dinesh");
		i.add("naveen");
		
		h.retainAll(i);
		System.out.println(h);
		
		
		

		
	}

}
