/*
이미지 복사
*/
package ch10.ex04;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferMain {
	
	public static void main(String[] args) throws IOException {
		
		// main stream
		FileInputStream fis = new FileInputStream("C:/STUDY/temp/friends_unagi.gif");
		FileOutputStream fos = new FileOutputStream("C:/STUDY/temp/friends_unagi_copy.gif");
		
		//sub stream
		BufferedInputStream bis = new BufferedInputStream(fis);
		DataOutputStream dos = new DataOutputStream(fos);
		
		dos.writeUTF("name");
		// 이미지 복붙 + 시간체크
		int i=0;
		int img = 0;
		long start = System.currentTimeMillis();
		
		while((img= bis.read()) != -1) {
			dos.write(img);
		}
		long end = System.currentTimeMillis();

		System.out.println("복사가 완료되었습니다.");
		System.out.println("걸린 시간 : "+ (end-start)+"ms");
		
		
		// 종료
		bis.close();
		dos.flush();
		dos.close();
		
		
	}
}
