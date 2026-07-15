package interface_task;
interface playable{
	void methodplay();
}
class MusicPlayer implements playable{
	public void methodplay() {
		System.out.println("Music player");
	}
}
class VideoPlayer implements playable{
	public void methodplay() {
		System.out.println("Video Player");

		
	}
}
public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MusicPlayer M = new MusicPlayer();
		VideoPlayer V = new VideoPlayer();
		M.methodplay();
		V.methodplay();

	}

}
