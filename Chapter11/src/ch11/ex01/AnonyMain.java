package ch11.ex01;

import java.util.Iterator;

public class AnonyMain {

	public static void main(String[] args) {
		
		Thread th = new Thread() {

			@Override
			public void run() {
				for (int i = 0; i < 5; i++) {
					System.out.println("work thread ");
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}//run()END
			
		};//thread END
		th.start();
				
		// thread 객체화
		/*
		 * Thread th = new Thread(new Runnable() {
		 * 
		 * @Override public void run() { for (int i = 0; i < 5; i++) {
		 * System.out.println("work thread"); try { Thread.sleep(500); } catch
		 * (InterruptedException e) { e.printStackTrace(); } } }
		 * 
		 * }); th.start(); // thread 실행
		 */
		// thread는 순서 제어X
		
		for (int i = 0; i < 5; i++) {
			System.out.println("main thread ");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}
