package ch11.ex07;

public class JoinThread extends Thread {

	private int sum;
	
	public int getSum() {
//		System.out.println("sum1 = "+sum);
		
		return sum;
	}
	
	public void setSum(int sum) {
		this.sum = sum;
	}
	
	@Override
	public void run() {
		
		for (int i = 0; i < 101; i++) {
			sum += i;
		}
//		System.out.println("sum2 = "+sum);
	}

}
