package ch08.ex03;

public class Main {

	public static void main(String[] args) {
		
		String[] arr = new String[2];
		
		try {
			arr[1] = "1234";
			arr[0] = null;
//			arr[2] = "1asdf";
			// ArrayIndexOutOfBoundsException
			
			int val1 = Integer.parseInt(arr[0]);
			int val2 = Integer.parseInt(arr[1]);
			
		}catch(ArrayIndexOutOfBoundsException | NullPointerException e) {
			
			System.out.println(e.toString());

		}catch(NumberFormatException ne) {
			
			System.out.println(ne.toString());
		
		}finally {
//			System.out.println(arr[1]);
//			System.out.println(val2);

		}
		
		
	}

}
