package ch11.ex09;


public class Main {

	public static void main(String[] args) throws InterruptedException {
		
		// 스레드 정지 방법
		// 1. stop flag 
		/*
		StopFlag st = new StopFlag();
		
		st.start();
		Thread.sleep(1000);
		st.setStop(true);
		//*/
		
		// 2. interrupt
		Inter inter = new Inter();
		inter.start();
		Thread.sleep(1000);
		inter.interrupt(); // interrupt 강제 발생
		
	}

}
