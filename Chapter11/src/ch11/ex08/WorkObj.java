package ch11.ex08;

public class WorkObj {
	
	public synchronized void work() {
		
		System.out.println(Thread.currentThread().getName()+"실행");
		
		notify();
		
		try {
			wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
