package ch02;

public class StrPlus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 문자가 발견되는 시접점 부터는 더하기(plus)가 아닌 추가(add)가 된다
		String str1 = "JDK" + 8 + 0.62;
		System.out.println(str1);
		
		
		String str2 = 8+0.65+"JDK";
		System.out.println(str2);
		
		//80.65JDK
		String str3 = 80+0.65+"JDK" ;
		System.out.println(str3);
		
	
	}

}
