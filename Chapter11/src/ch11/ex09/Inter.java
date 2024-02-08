package ch11.ex09;

public class Inter extends Thread {


	@Override
	public void run() {
		/*
		try {
			while(true) {
				System.out.println("inter thread is runing...");
				Thread.sleep(1);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
			System.out.println("자원 정리 ");
			System.out.println("정상 종료");
		}//*/
		
		while(true) {
			System.out.println("inter thread is runing...");
			if(Thread.interrupted()) {
				break;
			}
		}//whileEnd
		System.out.println("자원정리");
		System.out.println("종료");
		// stop(): 자원 정리 중 멈추기 때문에 문제 발생
		
	}//runEnd
	
	
}
