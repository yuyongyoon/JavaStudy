package ch11.ex04;

public class User1 extends Thread {

	private Computer com;
	
	public User1(Computer com) {
		setName("user1");
		this.com = com;
	}
	
	@Override
	public void run() {
		com.setScore(500);
	}
}
