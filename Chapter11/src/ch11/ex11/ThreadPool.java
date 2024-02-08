package ch11.ex11;

public class ThreadPool extends Thread {

	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}//try-catchEnd
			System.out.println("work/demon thread is running...");		
		}//whileEnd

	}

}
