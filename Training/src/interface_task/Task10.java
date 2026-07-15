package interface_task;

interface login{
	void authenticate(String name);
}

class AdminLogin implements login{
	public 	void authenticate(String name) {
		System.out.println(name+"\tlogin Successfull");
	}

}
class UserLogin implements login{
	public 	void authenticate(String name) {
		System.out.println(name+"\tUserlogin");

	}
}
public class Task10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AdminLogin a =new AdminLogin();
		UserLogin u = new UserLogin();
		a.authenticate("Arul");
		u.authenticate("Selva");

	}

}
