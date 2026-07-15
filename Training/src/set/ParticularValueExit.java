package set;

import java.util.HashSet;

public class ParticularValueExit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> value = new HashSet<String>();
		value.add("varun");
		value.add("kevin");
		value.add("sridhar");
		value.add("dinesh");
		value.add("madhan");
		String search = "sridhar";
		if(value.contains(search)) {
			System.out.println(search+"\t Exists in the set");
		}else {
			System.out.println(search+"\t does not Exists in the set");

		}

	}

}
