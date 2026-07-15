package abstract_class;
abstract class student{
	abstract void getGrade();
}
class student1 extends student{
	void getGrade() {
		System.out.println("Grade B");
	}
}
class student2 extends student{
	void getGrade() {
		System.out.println("Grade A");
	}
}
public abstract class Task7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student1 s1 = new student1();
		student2 s2 = new student2();
		s1.getGrade();
		s2.getGrade();

	}

}
