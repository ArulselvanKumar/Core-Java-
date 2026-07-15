package list;

import java.util.ArrayList;
import java.util.List;

public class Product {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> p = new ArrayList<String>();
		p.add("Shampoo");
		p.add("ToothPaste");
		p.add("soap");
		p.add("Brush");
		System.out.println(p);
		p.remove("soap");
		System.out.println(p);
		
	}

}
