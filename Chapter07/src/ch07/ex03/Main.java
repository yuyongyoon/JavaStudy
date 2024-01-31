package ch07.ex03;

public class Main {

	public static void main(String[] args) {

		MouseEvent me;
		me = new Window();
		me.click(0);
		me.dblclick(2);
		
		me = new Mac();
		me.click(1);
		me.dblclick(4);
		
	}

}
