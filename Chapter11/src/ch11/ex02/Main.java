package ch11.ex02;

public class Main {

	public static void main(String[] args) {
		
		Thread th = new Job();	// 스레드 객체화(상속-다형성 활용)
		th.start();
		
		for (int i = 0; i < 5; i++) {
			System.out.println("main");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
