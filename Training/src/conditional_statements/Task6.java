package conditional_statements;

public class Task6 {

	public static void main(String[] args) {
		// 7.Calculate grade based on marks
		
		int total=70;
		if(total>35 && total<60 ) {
			System.out.println("Grade C=" + total);
			
		}else if (total>60  && total<90) {
			System.out.println("Grade B="+ total);

		}else if (total >90  && total<100) {
			System.out.println("Grade A="+ total);

		}else {
			System.out.println("Grade D=" + total);
			
		}
	}

}
