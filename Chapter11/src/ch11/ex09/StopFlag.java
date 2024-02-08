package ch11.ex09;

public class StopFlag extends Thread {

	private boolean stop = false;
	
	public void setStop(boolean stop) {
		this.stop = stop;
	}

	@Override
	public void run() {
		while(!stop) {
			System.out.println("stop flag thread is running...");
			
		}
		System.out.println("successful exit");
	}
	
	
}
