package ch07.ex03;

public class Window implements MouseEvent {

	@Override
	public void click(int btn) {
		System.out.println("클릭");
	}

	@Override
	public void dblclick(int btn) {
		System.out.println("더블클릭");

	}

	@Override
	public double[] move() {
		System.out.println("움직임 자표 반환");
		return null;
	}

}
