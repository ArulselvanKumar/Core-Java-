package list;

import java.util.ArrayList;
import java.util.List;

public class Iterate_ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> t = new ArrayList<String>();
		t.add("Varun");
		t.add("kevin");
		t.add("sridhar");
		t.add("dinesh");
		t.add("madhan");
		
		for(int i=0;i<t.size();i++) {
			System.out.println(t.get(i));
		}
		
		

	}

}
