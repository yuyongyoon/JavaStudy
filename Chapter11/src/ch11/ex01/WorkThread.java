package ch11.ex01;

public class WorkThread implements Runnable {

	@Override
	public void run() {
		// 스레드가 해야할 일을 명시
		WorkThread job = new WorkThread();
		
		Thread th = new Thread(job);
		th.start();
		
		for (int i = 0; i < 5; i++) {
			System.out.println("work : "+i);
			try {
				Thread.sleep(i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
