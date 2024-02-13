package ch12.ex04;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {

	public static void main(String[] args) throws IOException {

		ServerSocket server = null;
		Scanner sc = new Scanner(System.in);

		System.out.println("[Server]");
		try {
			// 서버 소켓 생성
			server = new ServerSocket(5000);
			System.out.println("접속 대기중...");
			// 요청 수락
			Socket sck = server.accept();
			System.out.println("접속 수락!");
			
			// 메세지 보내기
			SndThread sender = new SndThread(sck);
			sender.start();
			
			// 메세지 읽기
			RcvThread receiver = new RcvThread(sck);
			receiver.start();
		
						
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			
		}
		//try-catchEnd		
		
	}//mainEnd

}
