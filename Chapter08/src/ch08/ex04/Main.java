package ch08.ex04;

public class Main {
	
	public static void main(String[] args) {
		
		String id = "manager";
		ReservedExp join = new ReservedExp(id);
		
		try {
			join.reservedCheck(id);
			
		} catch(Exception e) {
			System.out.println(id +"는 예약어 입니다.");
		}
		

		int age = 19;
		try {
			join.ageCheck(age);
		} catch (AdultExp e) {
			e.printStackTrace();	// 예외 상세 정보
			// 위보다 더 자세한 에러 사항 알려주고 싶으면 작성
		}
		
	}
	
}
