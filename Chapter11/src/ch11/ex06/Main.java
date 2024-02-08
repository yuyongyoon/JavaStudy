package ch11.ex06;

public class Main {

	private static Thread.State state;
	
	public static void main(String[] args) throws InterruptedException {
		
		YieldThread work = new YieldThread();
		YieldThread work2 = new YieldThread();
		
		work.setName("threadA");
		work2.setName("threadB");
		
		work.start();
		work2.start();
		
		work.yield = true;	// work 양보
		Thread.sleep(500); 	// after 0.5s
		
		work.yield = false;
		work2.yield = true;	// work2 양보
		Thread.sleep(500); 	// after 0.5s
		
		work.stop = true;
		work2.stop = true;	// work2 양보
		
	}

}
