package ch03;

public class StmtIf {

	public static void main(String[] args) {
		System.out.println("가게에 간다.");
		
		int tofuBox = 20;
		
		if (tofuBox > 0) {
			System.out.println("두부를 산다. ");
			tofuBox--;
			System.out.println("남아있는 두부 갯수 :" + tofuBox);
		}
		
		System.out.println("집에 온다.");
	}

}
