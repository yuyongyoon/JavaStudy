package ch11.ex04;

public class Main {

	public static void main(String[] args) {
		
		// 공유 컴퓨터
		Computer com = new Computer();
		
		User1 th1 = new User1(com);
		User2 th2 = new User2(com);

		th1.start(); // 200
		th2.start(); // 200
		
		/*
		 * 동일한 computer를 사용할 경우 
		 * thread1이 종료 없이 sleep(2s)하는 동안 
		 * thread2가 접근하여 score 값을 변경했기 때문에
		 * thread1과 thread2의 score 값 동일
		 * 이러한 접근을 막아주는 것 = 동기화
		 */
		
	}

}
