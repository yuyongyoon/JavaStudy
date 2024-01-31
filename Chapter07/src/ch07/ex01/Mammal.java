package ch07.ex01;

public abstract class Mammal {
		
	public String name;
	
	public Mammal(String name) {
		this.name = name;
	}
	
	public void birth() {
		System.out.println(name + "가 아이를 낳다");
	}
	
	public void eat() {
		System.out.println(name+"가 젖을 먹이다ㅣ");
	}
	
}
