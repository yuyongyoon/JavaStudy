package ch11.ex03;

public class Main {

	public static void main(String[] args) {
		
		Thread th1 = new WorkThread();
		th1.start();
		th1.setName("First Thread");

		Thread th2 = new WorkThread();
		th2.start();
		th2.setName("Second Thread");
		
		Thread th3 = new WorkThread();
		th3.start();
		th3.setName("Third Thread");
		
	}

}
