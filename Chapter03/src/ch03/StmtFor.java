package ch03;
import java.util.Iterator;

public class StmtFor {

	public static void main(String[] args) {
		// for(이것이; 이것을 만족한다면; 증가 또는 감소)
		// 반복횟수를 알 때
		//물10잔
		  for (int cup = 1; cup < 10; cup++) { 
			  System.out.println("물" + cup +"잔을 떠왔습니다"); 
			  }
		 // 
		  for (int cup = 1; cup < 10; cup++) {
			  System.out.println("물" + cup + "잔을 떠왔습니다");
			  for (int coffee = 1; coffee <= 2; coffee++) {
				  System.out.println("물"+ cup + "에 커피를" +coffee + "게 넣었습니다");
				
			}
			
		}
			  }
		  
	}

