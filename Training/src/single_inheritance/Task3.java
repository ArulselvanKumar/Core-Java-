package single_inheritance;

class studentClass{
	void school(){
		System.out.println("WELCOME TO SCHOOL");
	}
}
class CollegeStudentClass extends studentClass{
	void college() {
		System.out.println("WELCOME TO COLLEGE");
	}
}
public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CollegeStudentClass CSC = new CollegeStudentClass();
		CSC.college();
		CSC.school();

	}

}
