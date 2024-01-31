package ch07.ex04;

public class ChildImple implements Child {

	@Override
	public void keyDown(int key) {
		System.out.println((char)key+"키 누름");
	}

	@Override
	public void keyUp(int key) {
		System.out.println((char)key+"키 누뗌");
		
	}

	@Override
	public void click(int btn) {
		System.out.println(btn+"클릭");
		
	}

	@Override
	public void dblclick(int btn) {
		System.out.println(btn+"더블 클릭");
		
	}

	@Override
	public double[] move() {
		System.out.println("마우스 움직임");
		return null;
	}

	@Override
	public void textField(String inpu) {
		
	}

	@Override
	public void selectOne() {
		System.out.println("아이템 선택");
		
	}

	@Override
	public void checkOne() {
		System.out.println("아이템 체크");
		
	}

	
}
