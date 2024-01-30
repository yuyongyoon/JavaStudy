package ch03;
public class StmtElseIf {

	public static void main(String[] args) {
		//음료수 : 콜라, 생수, 오렌지주스, 사이다, 에너지음료, 냉커피, 식혜
		String item ="캔커피";
		
		if (item.equals("콜라")) {
			System.out.println(item + " 나왔습니다");
		}
		else if (item.equals("생수")) {
			System.out.println(item + " 나왔습니다");
		}
		else if (item.equals("오렌지주스")) {
			System.out.println(item + " 나왔습니다");
		}
		else if (item.equals("사이다")) {
			System.out.println(item + " 나왔습니다");
		}
		else if (item.equals("에너지음료")) {
			System.out.println(item + " 나왔습니다");
		}
		else if (item.equals("냉커피")) {
			System.out.println(item + " 나왔습니다");
		}else {
			System.out.println(item + "는 없습니다");
			}
	}

}
