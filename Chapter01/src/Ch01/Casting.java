package Ch01;

public class Casting {

	public static void main(String[] args) {
	
		char charValue;
		int intValue;
		long longValue;
		float floatValue;
		double doubleValue;
		
		//큰 애를 작은것으로 변환
		intValue = 74 ;
		charValue = (char)intValue;
		System.out.println(charValue);
		
		longValue = 500;
		doubleValue = 3.14 ;
		
		// long -> int
		intValue = (int)longValue;
		System.out.println(intValue);
		
		// double -> float
		floatValue = (float)doubleValue;
		System.out.println(floatValue);
	}

}
