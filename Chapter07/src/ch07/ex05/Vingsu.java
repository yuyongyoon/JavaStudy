package ch07.ex05;

public interface Vingsu {

	public default void iceFlacke() {
		System.out.println("ice");
	}
	
	public default void milk() {
		System.out.println("milk");
		}
	public default void readBean() {
		System.out.println("readBean");
	}
	public default void jelly() {
		System.out.println("jelley");
	}	
	public void etc();
}
