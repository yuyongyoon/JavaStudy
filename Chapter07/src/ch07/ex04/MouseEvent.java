package ch07.ex04;

public interface MouseEvent {
	
	// interface는 추상 메서드가 기본
	public abstract void click(int btn);
	
	public abstract void dblclick(int btn);
	
	public abstract double[] move();
}
