package ch11.ex04;

public class User2 extends Thread {

	private Computer com;
	
	public User2(Computer com) {
		setName("user2");
		this.com = com;
	}
	
	@Override
	public void run() {
		com.setScore(200);
	}
}
