package ch11.ex12;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class Test {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		ExecutorService pool = null;
		
		// Thread pool 생성
		int n = Runtime.getRuntime().availableProcessors();
		pool = Executors.newFixedThreadPool(n);
		
		// 수행 작업
		Callable call = new Callable<String>() {
			@Override
			public String call() throws Exception {
				// thread 1개당 내용 10번 출력
				for(int i=0; i<10; i++) {
					System.out.println("thread pool ");
				}
				return "callTherad";
			}
		};
		
		// 작업 요청
		Future<String> fu = null;
		
//		for(int i=0; i<10; i++) {
//			fu = pool.submit(call);				// thread 10개
//			System.out.println(fu.get()+(i+1));	// thread 내용 10번 출력
//		}

		// 작업 완료 시 종료
		pool.shutdown();
		boolean end = pool.awaitTermination(1L, TimeUnit.SECONDS);
		System.out.println("종료 여부: "+end);
	}

}
