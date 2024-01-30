package ch03;

public class StmtSwitch {

	public static void main(String[] args) {
		
		
		String item ="사이다";
		
		//JDK 1.6 이하에서는 switch문에 숫자, 문자(char)만 사용 가능하다
		//모든 구문은 코드블록 시작부터 끝까지 읽게 되어있다
		switch (item) {
		case "콜라"://case문에서는 특정 case 위치로 이동시켜준다
			System.out.println(item+"가 나왔습니다");
			break; //break를 통해 코드블록을 빠져나오는 것
			
		case "사이다":
			System.out.println(item+"가 나왔습니다");
			break;
			
		case "생수":
			System.out.println(item+"가 나왔습니다");
			break;
			
		default:
			System.out.println(item+"는(은) 없습니다");
			break;
		}

	}

}
