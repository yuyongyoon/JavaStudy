package ch02;

public class Compare {

	public static void main(String[] args) {
		// = 은 대입연산자
		int v1 = 1 ;
		double v2 = 1.0;
		int v3 = 4; 
		// 문자열은 여러 방법으로 문자열로 선언할 수있다
		String v4 = "JAVA";
		String v5 = new String("JAVA");
		
		//비교 연산
		System.out.println(v1==v2);
		System.out.println(v1 != v2);
		System.out.println(v1 < v3);
		System.out.println(v4 == v5); //같은 문자인데 같지 않음 // 문자열은 == 사용하지 말자
		System.out.println(v4.equals(v5)); //하지만 equals메소드 쓰면 같다고 나옴 //문자열 비교는 반드시 eqauls로 해주자
		
		String id ="admin";
		String pw ="pass";
		//입력받은 id pw 가 같다면 로그인시켜주자
		if(id.equals("admin") && pw.equals("pass")) {
			System.out.println("로그인되었습니다");
		}
	}

}
