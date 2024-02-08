package ch11.ex06;

public class YieldThread extends Thread {

	boolean stop = false;
	boolean yield = false;
	
	@Override
	public void run() {
		
		while(!stop) {
			
			System.out.println("동작 주체: "+ getName());
			if(yield == true) {
				System.out.println(getName()+"이 양보");
				Thread.yield();
			}//if End
			
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}//try-catch End
			
		}//while End
		System.out.println();
		System.out.println(getName()+"중지");
		
	}

}
