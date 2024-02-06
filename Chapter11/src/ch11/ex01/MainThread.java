package ch11.ex01;

public class MainThread {

	public static void main(String[] args) throws InterruptedException {

		WorkThread job = new WorkThread();
		Thread th = new Thread(job);
		th.start();
		
		for (int i = 0; i < 5; i++) {
			System.out.println("main thread : "+i);
			Thread.sleep(500);
		}
	}

}
