/*
NIO 방식으로 파일 읽고 쓰기
*/
package ch10.ex10;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.Scanner;

public class NewIO {
	public static void main(String[] args) throws IOException {
		
		// NIO
		String addr = "C:/STUDY/temp/sample.txt";
		Path path = Paths.get(addr);
	
		// file 내용 출력
		System.out.println(path.getFileName()+" 내용 출력\n");
		List<String> lines = Files.readAllLines(path);
		for(String str : lines) {
			System.out.println(str);
		}
		
		// file 내용 입력
		System.out.println("\n=======================");
		System.out.print("파일에 저장할 내용 입력: ");
		Scanner sc = new Scanner(System.in);
		String msg = sc.nextLine()+"\r\n";
		// write
		Files.write(path, msg.getBytes("UTF-8"), StandardOpenOption.APPEND);
		/*
		 * append : 파일 존재할 경우 내용 추가
		 * create : 파일 존재 안할 경우 파일 생성
		 * create_new: 이미 파일 존재할 경우 새 파일 생성
		 * read: 읽기 전용
		 */
		// return sources
		sc.close();
		System.out.println("\n저장 완료! \n저장한 파일을 엽니다...");
		
		// file 존재 시 열기
		if(Files.exists(path)) {
			Desktop.getDesktop().open(new File(addr));
		}

		
	}
}
