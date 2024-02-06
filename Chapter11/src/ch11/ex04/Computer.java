package ch11.ex04;

public class Computer {
	
	private int score;
	// thread 충돌
	/*
	public void setScore(int score) {
		
	  this.score = score;
	  
	  try { Thread.sleep(2000); // 2초 휴식 } catch (InterruptedException e) {
	  e.printStackTrace(); }
	  
	  System.out.println(Thread.currentThread().getName()+" : "+this.score);
	
	//*/
		
	// synchronized
	// 1. synchronized method : 메서드 진입 전체 막음
	/*
	public synchronized void setScore(int score) {
	
		this.score = score;
		  
		  try { 
			  Thread.sleep(2000); // 2초 휴식 
		  
		  } catch (InterruptedException e) {
			  e.printStackTrace(); 
		  }
		  
		  System.out.println(Thread.currentThread().getName()+" : "+this.score);
	//*/
	
	// 2. synchronized block : 특정 영역 진입 막음
	public void setScore(int score) {
		
		synchronized (this) {
			this.score = score;
			try { 
				Thread.sleep(2000); // 2초 휴식 
			  
			} catch (InterruptedException e) {
				 e.printStackTrace(); 
			}
			  
			System.out.println(Thread.currentThread().getName()+" : "+this.score);
				
		}
		  
		  
	}
}
