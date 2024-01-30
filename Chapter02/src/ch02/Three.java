package ch02;

public class Three {

	public static void main(String[] args) {
		
		
		int score = 75;
//		char grade = score > 90 ?  'A' : 'B';
		//90보다 크면 a 
		//80보다 크면 b
		//아니면 C
		
		char grade = score > 90 ? 'A' : 'B'; // score > 90이 조건문이고 ?물음표 뒤에 오는게 반환값1 : 반환값2
		
		char grade2 = score > 90 ? 'A' : score > 80 ? 'B' : 'C' ; // 이 문장은 그러면 조건식이 하나있고 만족하면 A를 반환하는데 만족안하면 새로운 조건문인 score >80 조건문으로 넘어감
		
		System.out.println(score + "점은 등급 : " + grade2);

	}

}
