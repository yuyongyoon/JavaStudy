package ch11.ex11;

import ch11.ex09.StopFlag;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		/*
		 * 부모 = new 자식 -> 다형성 활용
		 * 조건: 자식 클래스에 run(오버라이드 메소드)외 다른 메소드 없기 때문 가능
		*/
		Thread demon = new ThreadPool();
		demon.setDaemon(true);				// demonThread 만들어줌
		
		demon.start();
		
		Thread.sleep(5000);
		
		System.out.println("main thread exit");
		
		/*
		 * workThread: mainThread 종료 시에도 계속 동작
		 * demonThread: mintThread와 함께 종료
		*/
	}

}
