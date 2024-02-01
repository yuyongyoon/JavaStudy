package ch08.ex04;

// 실행 예외
public class ReservedExp extends RuntimeException {
	
	public ReservedExp(String message) {
		super(message);
	}
	
	public void reservedCheck(String id) {
		String[] reserved = {"admin", "tester", "manager"};
		
		for(String r : reserved) {
			if(r.equals(id)) {
				throw new ReservedExp(id+"으로 예약 완료");
			}
		}
	}
	
	public void ageCheck(int age) throws AdultExp {
		
		if(age < 20) {
			throw new AdultExp("성인만 가입 가능");
		}
	}
	
	

}
