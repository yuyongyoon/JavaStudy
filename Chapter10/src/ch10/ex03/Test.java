package ch10.ex03;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) throws IOException {
		
		
		// 파일 입력 객체 생성
		File src = new File("C:/STUDY/temp/sample.txt");
		FileWriter writer = new FileWriter(src, true);

		// 스캐너 객체 생성
		System.out.print("파일 내용 입력 : ");
		Scanner sc = new Scanner(System.in);
		
		// 입력한 내용 문자열에 저장
		String input = sc.nextLine();
		
		// 입력한 내용 쓰기
		writer.write(input+"\r\n");
		System.out.println("입력한 내용을 <sample.txt>로 저장했습니다.");
		
		// 정료
		writer.flush();
		writer.close();
		
		
	}

}
