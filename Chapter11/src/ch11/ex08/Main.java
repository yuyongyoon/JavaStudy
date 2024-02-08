package ch11.ex08;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		
		WorkObj obj = new WorkObj();
		
		WorkThread wt1 = new WorkThread(obj);
		WorkThread wt2 = new WorkThread(obj);
		
		wt1.start();
		wt2.start();
		
		
		
	}

}
