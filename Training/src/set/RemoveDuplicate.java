package set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> h = new ArrayList<String>();
		h.add("varun");
		h.add("kevin");
		h.add("sridhar");
		h.add("dinesh");
		h.add("sridhar");
		h.add("madhan");
		System.out.println(h);

		HashSet<String> i = new HashSet<String>(h);
		System.out.println(i);
		
	}

}
