package method_Overloading;

public class Task9 {
	void Checkpalindrome(String str) {
		String rev="";
		for(int i =str.length()-1;i>=0;i--) {
			rev= rev+ str.charAt(i);
		}
		if(str.equals(rev)) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not Palindrome");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Task9 pn = new Task9();

		pn.Checkpalindrome("MadaM");

	}

}
