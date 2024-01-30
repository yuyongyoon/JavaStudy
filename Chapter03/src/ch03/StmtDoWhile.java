package ch03;

public class StmtDoWhile {

	public static void main(String[] args) {
		
		int cnt = 11;
		
		while (cnt < 10) { //조건을 먼저보고 
			cnt++; //실행이된다
			
		}
		System.out.println("while cnt"+ cnt);
		
		cnt = 11;
		do {
			cnt++; //먼저 실행을하고 
		} while (cnt<10); //조건을 본다
		System.out.println("do while "+ cnt);

		
		//조건이 만족되 못하는 상황으로 시작할 때는 두 구문이 다르게 반응한다
	}

}
