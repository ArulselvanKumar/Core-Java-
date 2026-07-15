package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> n = new ArrayList<Integer>();
		n.add(5);
		n.add(2);
		n.add(0);
		n.add(3);
		n.add(7);
		n.add(4);
		
		int largest = Collections.max(n);
		int smallest = Collections.min(n);
		System.out.println(largest);
		System.out.println(smallest);
		

	}

}
