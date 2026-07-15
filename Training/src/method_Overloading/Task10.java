package method_Overloading;

public class Task10 {
	void replaceChar(String str, char oldchar, char newchar) {
		String result = str.replace(oldchar, newchar);
		System.out.println(result);
	}
	void replaceChar(String str,String oldText,String newText) {
		String result = str.replace(oldText,newText);
		System.out.println(result);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Task10 n = new Task10();
		n.replaceChar("Arul", "l", "n");
		n.replaceChar("Hi Arul","Arul","Selva");
		

	}

}
