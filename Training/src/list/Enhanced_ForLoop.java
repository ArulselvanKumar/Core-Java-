package list;

import java.util.ArrayList;
import java.util.List;

public class Enhanced_ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> t = new ArrayList<String>();
		t.add("Varun");
		t.add("kevin");
		t.add("sridhar");
		t.add("dinesh");
		t.add("madhan");
		for(String name: t) {
			System.out.println(name);
		}

	}

}
