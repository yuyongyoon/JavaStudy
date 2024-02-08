package ch11.ex12;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;


public class Main {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		ExecutorService pool = Executors.newCachedThreadPool();
		
		// 수행 작업
		/*// 1. Callable
		Callable call = new Callable<Integer>() {
			@Override
			public Integer call() throws Exception {
				int sum = 0;
				for(int i=1; i<=100; i++) {
					sum += i;
				}
//				System.out.println(sum);
				return sum;
			}
		};//*/
		// 2. Runnable
		Runnable run = new Runnable() {
			@Override
			public void run() {
				int sum = 0;
				for(int i=1; i<=5; i++) {
					System.out.println("running...");
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						System.out.println("강제 종료");
						e.printStackTrace();
					}
				
				}//forEnd
			
			}//runEnd
		
		};//runnableEnd
		
//		===================================================
		// 실행
		/*// 1. Callable 사용한 경우		
		Future<Integer> fu = pool.submit(call);		
		// 반환값 출력
		int sum = (int) fu.get();
		System.out.println("sum = "+sum);//*/
		/*
		 * blocking == join() 
		 * 반환 내용을 실행과 동시에 먼저 출력해버림
		 * Future 객체에서 get()호출할 때까지 다른 스레드 동작X
		 */
		
		// 2. Runnable 사용한 경우
//		pool.execute(run);		// 내용은 찍히지만 blocking 활성화X
		// Runnable Blocking 하는 방법
		Future<?> fu = pool.submit(run);
		fu.get();
		/*
		 * runnable은 반환X
		 * but, Blocking을 위해 Future<?>를 사용해서 submit()호출 가능
		*/

//		===================================================
		// 작업 완료 시 종료
		System.out.println("작업 완료");
		pool.shutdownNow();
//		pool.shutdown();
//		boolean end = pool.awaitTermination(1L, TimeUnit.SECONDS);
	}

}
