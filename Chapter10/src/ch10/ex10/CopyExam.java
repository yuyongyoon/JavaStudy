package ch10.ex10;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class CopyExam {

	public static void main(String[] args) throws IOException {
		
		String addr = "C:/STUDY/temp/friends_unagi.gif";
		String copy_addr = "C:/STUDY/temp/friends_unagi.gif_copy.gif";
		
		Path path = Paths.get(addr);
		Path path_copy = Paths.get(copy_addr);
		
		long start = System.currentTimeMillis();
		// 파일 복사
		Files.copy(path, path_copy, StandardCopyOption.REPLACE_EXISTING);
		/*
		 * replace_existing: 이미 파일 존재 시 덮어 쓰기
		 * copy attributes: 파일 속성까지 복사
		 */
		long end = System.currentTimeMillis();
		System.out.println("복사 완료!");
		System.out.println("걸린 시간: "+(end-start)+"ms");
		
		// file 존재 시 열기
		if(Files.exists(path)) {
			Desktop.getDesktop().open(new File(copy_addr));
		}
	}

}
