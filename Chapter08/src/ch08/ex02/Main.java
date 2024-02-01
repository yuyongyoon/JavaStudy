package ch08.ex02;

public class Main {

	public static void main(String[] args) {

		String str = "문자열을 ";
		str += "추가하면 ";
		str += "객체 증가 ";
		System.out.println(str);
		
		// StringBuffer
		StringBuffer buffer = new StringBuffer("문자열을 ");
		buffer.append("추가하면 ");
		buffer.append("객체 증가");
		System.out.println(buffer);
		
		str = buffer.toString(); // buffer 문자열화
		System.out.println(buffer);
		
		str = buffer.reverse().toString();//reverse
		System.out.println(buffer);

	}

}
