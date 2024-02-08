package ch11.ex05;

public class Main {

	private static Thread.State state;
	
	public static void main(String[] args) {
		
		StateThread work = new StateThread();
		state = work.getState();
		System.out.println("Thread state : "+state);
		work.start();
		
		while(true) {
			state = work.getState();
			System.out.println("Thread State: "+ state);
			
			if(state == Thread.State.TERMINATED) {
				break;
			}
		}
		
		
	}

}
