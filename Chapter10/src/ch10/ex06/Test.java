/*
이미지 복사
*/
package ch10.ex06;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) throws IOException {
		// main stream
		// file 경로에 입력을 위함
		FileOutputStream fos = new FileOutputStream("C:/STUDY/temp/input_sample.dat", true);
								
		// sub stream
		// 성능 향상
//		BufferedOutputStream bos = new BufferedOutputStream(fos);
		// 기본 타입 입출력
		DataOutputStream dos = new DataOutputStream(fos);
		
		// data 입력 받기
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름/급여/승진여부 입력 해주세요!");
		String input = sc.next();
		
		// data 쪼개고 쓰기
		// 구분 문자 기준으로 쪼갠 문자열을 UTF형식의 문자열로 입력
		for (String string : input.split("/")) {
			dos.writeUTF(string);
		}
		dos.writeBytes("+\r\n");
		System.out.println("\n정보가 업데이트 완료되었습니다.\n");
		
		
		// 종료
		dos.flush();	// 모두 내보냄
		dos.close();	// 자원 닫기
						
		
		
	}
}
