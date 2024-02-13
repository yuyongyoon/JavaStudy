/*
 * <파일 주고 받기>
 * Sender = Client
 * serverIP, portNo, filenmae
 * 
*/

package ch12.ex03;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketAddress;

public class Sender {

	public static void main(String[] args) throws IOException {

		int port = 5050;
		String ip = "192.168.70.111";

		// 소켓 생성
		Socket sck = new Socket(ip, port);
		
		// 내 pc에 파일 불러오기
		File file = new File("C:/STUDY/temp/friends_unagi.gif");
		// 파일 이름
		String filename = file.getName();
		//파일 사이즈
		long size = file.length();
		
		// 파일 읽는 스트림		
		FileInputStream fis = new FileInputStream(file);
		BufferedInputStream bis = new BufferedInputStream(fis);
		// 파일 보내는 스트림
		BufferedOutputStream bos = new BufferedOutputStream(sck.getOutputStream());
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		
		// 파일 이름 보내기
		oos.writeUTF(filename);
		// 파일 사이즈만큼 데이터 
		byte[] arr = new byte[(int)size];
		
		int data = bis.read(arr);
		System.out.println(data);	// 한번에 읽은 파일 크키
		
		// 바이트 전송		
		oos.write(arr);		
		System.out.println("파일을 서버에 보냈습니다.");
		
		// 종료
		oos.flush();
		oos.close();
		bis.close();
		sck.close();

		


	}

}
