/* 
 * 파일 복사
 */

package ch10.ex02;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {

	public static void main(String[] args) throws IOException {
		// 읽어올 파일 객체
//		File src = new File("C:/STUDY/temp/GettyImageBank.jpg");
		// 복사할 파일 경로
		FileInputStream fis = new FileInputStream("C:/STUDY/temp/friends_unagi.gif");
		
		// 내보낼 파일 객체
//		File dst = new File("C:/STUDY/temp/GettyImageBank2.jpg");
		// 복사될 파일 경로
		FileOutputStream fos = new FileOutputStream("C:/STUDY/temp/friends_unagi_copy.gif");
		
		// 읽고 쓰기
		int data;
		int i = 0;
		
//		while((data = fis.read()) != -1) {
//			fos.write(data);
//			i++;	// 성능 체크
//			System.out.println("파일 복사 중..."+i);
//		}
		
		byte[] arr = new byte[1024];
		
		while(fis.read(arr) != -1) {
			fos.write(arr);
			i++;	// 성능 체크
			System.out.println("파일 복사 중..."+i);
		}
		
		// 종료
		fos.flush();
		fos.close();
		fis.close();
	}

}
