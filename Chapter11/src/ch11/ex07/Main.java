package ch11.ex07;


public class Main {

	public static void main(String[] args) throws InterruptedException {
		
		JoinThread join = new JoinThread();
		
		join.start();
		
//		join.sleep(100);
		/*
		 * work thread 동작을 끝까지 수행하지 못한 상태에서
		 * main thread가 값 출력 -> 원하는 결과X
		 * => Thread.sleep(N)로 thread를 잠시 쉬게 해야함
		 * but, thread가 무조건 쉬어야 하기 때문에 시간 낭비 발생
		 * => Thread.join() 으로 문제 해결
		 */	
		join.join();	// blocking : 작업 수행 끝날때까지 기다림
		
		System.out.println("result = "+ join.getSum());
		
	}

}
