package ch07.ex04;

import ch07.ex03.MouseEvent;

public interface Child extends MouseEvent, KeyEvent {
	
	public void textField(String inpu);
	
	public void selectOne();
	
	public void checkOne();

}
