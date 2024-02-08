package ch11.ex10;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class Main {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		// pool 생성
		ExecutorService pool = null;
		/*
		 * null-> 요청 받으면 생성
		 * 반납 받은 스레드 빌려줌
		 * 반납 받은 스레드 60초 놀고 있으면 버림	
		*/		
		int n = Runtime.getRuntime().availableProcessors();
		// n = cpu 사용 가능 메인 스레드 수
		// 현재 pc에서 사용 가능한 스레드 수
//		System.out.println(n);
		pool = Executors.newFixedThreadPool(n);

//		===========================================================
		// 동작 작성
		/*// 1. Runnabel
		Runnable run = new Runnable() {
			public void run() {
				System.out.println("thread pool name: "+Thread.currentThread().getName());
			}
		};//*/
		
		// 2. Callable
		Callable call = new Callable<String>() {

			@Override
			public String call() throws Exception {
				return "thread pool name: "+ Thread.currentThread().getName();
			}
		};//*/
		
//		===========================================================		
		// thread 실행
		// 1. execute() - 반환X
//		pool.execute(run);
//		pool.execute(call);
		
		// 2. Submit() - 반환O
		Future<String> fu = pool.submit(call);
		System.out.println(fu.get());
		
//		===========================================================	
		// 종료
		pool.shutdown();	// 끝가지 종료
		pool.awaitTermination(1L, TimeUnit.SECONDS);	// 종료 후 wait
		System.out.println("Thread End");
	}

}
