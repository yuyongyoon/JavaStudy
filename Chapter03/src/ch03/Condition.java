package ch03;

public class Condition {

	public static void main(String[] args) {
		
		boolean a = true;
		boolean b = false;
		
		if (a) {
		System.out.println("조건문은 참일 때 만 실행된다");	
		}
		if (!b) {
			System.out.println("조건문은 거짓일 때 실행 안된다");
		}
	}

}
