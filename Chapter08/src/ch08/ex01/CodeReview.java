package ch08.ex01;

public class CodeReview {

	public static void main(String[] args) {

		String str = "alvdlaekdiadla";
		String rslStr;
		int rslInt;
		boolean rslBool;
		char rslChar;
		
		// 문자열 문자 찾기
		System.out.println(str);
		// 1
		System.out.println("\n문자 위치 찾기1");
		
		for(int i=0; i < str.length(); i++) {
			if(str.charAt(i) == 'f') {
				System.out.println("f위치: "+(i+1));				
			}
		}
		// 2
		System.out.println("\n문자 위치 찾기2");
		char[] c = str.toCharArray();		
		
		for(int i=0; i < str.length(); i++) {
			if(c[i] == 'a') {
				System.out.println("a위치: "+(i+1));				
			}
		}
		// 3[code review]
		System.out.println("\n문자 위치 찾기3");
		rslInt = 0;		// 목표 일치 위치
		int cnt = 0;	// 현재 위치
//		System.out.println(str);

		while(rslInt > -1) {							// 목표와 일치하는 문자가 없는 경우
			rslInt = str.indexOf('a', cnt);				// 목표와 일치하는 문자 위치 저장
			if(cnt == rslInt) {							// 현재 위치와 일치하면
				System.out.println("a위치: "+(cnt+1));	// 문자 위치 출력		
			}
			cnt++;										// 다음 위치부터 검색
		}	
		
	}

}
