package multilevel_inheritance;
class student extends collegeStudent{
	void school() {
		System.out.println("School Student");
	}
}
class collegeStudent extends EngineeringStudent{
	void degree() {
		System.out.println("Degree");
	}
}
class EngineeringStudent{
	void BE(){
		System.out.println("BE Degree");
	}
}

public class Task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student s = new student();
		s.school();
		s.degree();
		s.BE();

	}

}
