/*
파일 읽고 쓰기
*/

package ch10.ex01;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.nio.charset.Charset;

public class StreamMain {

	public static void main(String[] args) throws IOException {
		
		File dir = new File("C:/STUDY/JAVA");
		
		if(!dir.exists()) {
			System.err.println("no folder");
			dir.mkdirs();
		}
		
		// 파일 경로 + 파일 객체 생성
		File file = new File("C:/STUDY/temp/report.txt");
		
		// 파일 리스트 출력
		String[] files = dir.list();
		for (String name : files) {
			System.out.println(name);
		}
		System.out.println("======================");
		
		
		// inputstream
		// fileReader 객체 생성
		FileReader reader = new FileReader(file, Charset.forName("UTF-8"));
		
		// read file. EOF(내용 없으면 -1 반환)
		int data;
		
		while((data = reader.read()) != -1) {
			System.out.print((char)data);
		
		}

		// close
		reader.close();
		
		// OutputStream
		// fileWriter 객체 생성          
		FileWriter writer = new FileWriter(file, true);
		// 파일 생성
		file.createNewFile();
		
		writer.write("InputStream Wirter\r\n");
		
		writer.flush();
		writer.close();
		
		System.out.println("======================");
		
		
		
	}

}
