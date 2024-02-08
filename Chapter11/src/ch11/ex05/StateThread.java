package ch11.ex05;

public class StateThread extends Thread {

	@Override
	public void run() {
		
		long cnt = 0;


		for(int i=0; i < 100000; i++) {
			cnt++;
		}
		
		try {
			Thread.sleep(150);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		cnt = 0;
		
		for(int i=0; i < 100000; i++) {
			cnt++;
		}
		
//		System.out.println("작업 수행 완료");

		/*
		 * thread 실행 동안 running과 runnable 상태를 왔다 갔다 하며 동작
		 * => 시분할 방식
		*/
	}

}
