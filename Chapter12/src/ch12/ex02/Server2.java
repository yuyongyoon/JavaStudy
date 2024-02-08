package ch12.ex02;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server2 {

	public static void main(String[] args) throws IOException {

		ServerSocket server = null;
		Scanner sc = new Scanner(System.in);

		System.out.println("[Server]");
		try {
			// 1. 서버 소켓 생성
			server = new ServerSocket(5500);
			
			// 2. 접속 대기
			while(true) {
				// 3. 요청 수락
				Socket sck = server.accept();
				
				//메세지 읽기
				InputStream is = sck.getInputStream();
				ObjectInputStream ois = new ObjectInputStream(is);
				
				OutputStream os = sck.getOutputStream();
				ObjectOutputStream oos = new ObjectOutputStream(os);
				
				String rcvMsg = ois.readUTF();
				System.out.println("Client: "+rcvMsg);
				
				//================== save============================
				/*//메세지 보내기
				System.out.print("Server: ");
				String sndMsg = sc.nextLine();
//				System.out.print(sndMsg);
				
				oos.writeUTF(sndMsg);
				//*/
				
				// 종료
				ois.close();
				oos.flush();
				oos.close();
			
			}//whileEnd
						
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			
		}
		//try-catchEnd		
		
	}//mainEnd

}
