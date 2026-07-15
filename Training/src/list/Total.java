package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Total {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> t = new ArrayList<String>();
		t.add("Varun");
		t.add("kevin");
		t.add("sridhar");
		t.add("dinesh");
		t.add("madhan");
		int l=t.size();	
		System.out.println(l);
		
		Collections.reverse(t);
		System.out.println(t);
		

	}

}
