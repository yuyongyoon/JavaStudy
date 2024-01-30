package Ch01;

public class Scope {//클래스
	String str ="some text" ; //클래스 안에서 사용 가능
	
	public static void main(String[] args) { //메소드,function 
		// TODO Auto-generated method stub
		int num = 123 ;// 메소드 안에서 사용가능
		
		for (int i = 0; i < 5; i++) { //문장(statement)
			int sum = num + i ; //statement 안에서만 사용 가능
			System.out.println(sum);
			
		}
		// System.out.println(sum); sum은 for문장을 넘어갈 수 없다
	}

}
