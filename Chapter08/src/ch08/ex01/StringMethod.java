package ch08.ex01;

import java.util.Arrays;

public class StringMethod {

	public static void main(String[] args) {
		
		String str1 = "asdfaedzx";
		String str2 = new String("sdlkjfs");
		char[]arr = {'a','b','d','d'};
		String Str3 = new String(arr);
		
		String rslStr;
		int rslInt;
		boolean rslBool;
		char rslChar;
		
		
		rslBool = "abc".equals(str1);
		System.out.println("동일 여부: "+rslBool);
		
		
		rslBool = str1.contains("a");
		System.out.println("\n포함 여부: "+rslBool);
		
		
		rslStr = str2.replace("s", "S".toUpperCase());
		System.out.println("\n대소문자 변경: "+rslStr);
		
		
		str2 = " sdfsdfsef ";
		System.out.println("\nbefore: "+str2);
		
		str2 = str2.trim();
		System.out.println("after: "+str2);
		
		
		str1 = "[img]uploadFile.png";
		System.out.println("\ntarget: "+ str1);
		
		rslBool = str1.startsWith("[img]");
		System.out.println("[img]시작: "+rslBool);
		
		rslBool = str1.endsWith(".png");
		System.out.println(".png 끝: "+rslBool);
		
		
		
		rslStr = "*".repeat(3);
		System.out.println("\n*변환: "+rslStr);
		
		
		rslInt = str1.length();
		System.out.println("\n문자 길이: "+rslInt);
		
		
		rslChar = str1.charAt(3);
		System.out.println("\n특정 인덱스: "+rslChar);
		
		
		rslStr = str1.substring(5, 11);
		System.out.println("\n문자열 자르기: "+rslStr);

		
		str1 = "a/b/s/e/g/d/s/z/e/";
		String[] list = str1.split("/");
		System.out.println("\n특정 문자 기준 자르기: "+Arrays.toString(list));
		
		
	}

}
