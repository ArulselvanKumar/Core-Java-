package list;

import java.util.ArrayList;
import java.util.List;

public class StudentName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> nm = new ArrayList<String>();
		nm.add("Varun");
		nm.add("kevin");
		nm.add("sridhar");
		nm.add("dinesh");
		nm.add("madhan");
		boolean c =nm.contains("kevin");
		System.out.println(c);
		

	}

}
