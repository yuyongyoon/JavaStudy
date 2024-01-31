package ch07.ex01;

public class Main {

	public static void main(String[] args) {
//		Mammal mal = new Mammal();
		// 추상 클래스는 자식 외 절대 호출X
		Person p = new Person("철수");
		// 자식 객체 호출 가능
		p.useTool();
		p.social();
		// 부모 객체 호출 가능
		p.eat();
		p.birth();
		
	}

}
