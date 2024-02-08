package ch11.ex08;

public class WorkThread extends Thread {

	private WorkObj wobj;
	
	public WorkThread(WorkObj wobj) {
		this.wobj = wobj;
	}
	
	@Override
	public void run() {
		
		for(int i=0; i<6; i++) {
			wobj.work();
		}
	}

}
