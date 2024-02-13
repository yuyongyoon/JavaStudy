/*
 * <파일 주고 받기>
 * Receiver = Server
 * port, filenmae
 * 
*/

package ch12.ex03;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

public class Receiver {

	public static void main(String[] args) throws IOException  {
		
		int port = 5050;
		String filename = null;
		// 서버 소켓 생성
		ServerSocket sender = new ServerSocket(port);
		
		// 접속 대기
		while(true) {
			// 접속 요청이 들어오면 blocking을 걸고 수락함 / 그 외는 대기
			Socket sck = sender.accept(); 
			
			// 파일 읽기
			BufferedInputStream bis = new BufferedInputStream(sck.getInputStream());
			ObjectInputStream ois = new ObjectInputStream(bis);
			
			// 파일 이름 가져오기
			filename = ois.readUTF();
			
			// pc에 저장
			FileOutputStream fos = new FileOutputStream("C:/Users/GD/Downloads/"+filename);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			// 읽은 데이터 저장
			int data;
			while((data=bis.read()) != -1){
				bos.write(data);
			}
			System.out.println("파일이 저장 완료되었습니다.");
			
			// 종료
			ois.close();
			bos.flush();
			bos.close();
			sck.close();

		}	
	}
}
