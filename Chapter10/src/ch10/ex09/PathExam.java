package ch10.ex09;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathExam {
	public static void main(String[] args) throws IOException {
		
		String addr = "C:/STUDY/temp/";
		Path path = Paths.get(addr);
		// FileExam
		System.out.println("file name: "+path.getFileName());
		System.out.println("Super directory name: "+path.getParent().getFileName());
		System.out.println("root: "+path.getRoot());

		// PathExam
		System.out.println("directory: "+Files.isDirectory(path));
		
		Path file = Paths.get("C:/STUDY/temp/Sample");
		// 폴더와 파일 생성
		if(Files.notExists(file)) {
			Files.createDirectories(file);
			Files.createFile(file);
		}
		
		
		
	}
}
