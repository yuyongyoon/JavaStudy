package Ch01;

public class Promotion {

	public static void main(String[] args) {
		//작은거에서 큰걸로 갈 땐 묵시적 형변환(Promotion)
		byte byteValue ;
		char charValue = 'a';
		int intValue = 0;
		long longValue;
		float floatValue;
		double doubleValue;
		
		
		//byte < int
		byteValue = 10 ;
		intValue = byteValue;
		
		//char < int
		intValue = charValue;
		System.out.println(intValue); //97 -> 아스키코드
		
		//int < long
		longValue = intValue ;
		
		//float < double
		floatValue = 0.1f ;
		doubleValue = floatValue ;
		
	}

}
