package ch07.ex01;

public class Person extends Mammal {

	public Person(String name) {
		super(name);
	}
	
	// 상속으로 인해 부모의 변수 name을 자식에서 자유롭게 사용 가능
	public void useTool() {
		System.out.println(name+"가 도구를 가용한다");
	}
	
	public void social() {
		System.out.println(name+"가 사회생활 한다");
	}
	
}
