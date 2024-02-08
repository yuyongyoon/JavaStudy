package ch12.ex01;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) {

		// 1. 서버 소켓 생성
		ServerSocket server = null;

		try {
			server = new ServerSocket(5500);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		
		// 2. 요청 대기
		while(true) {
			System.out.println("대기중...");
			Socket sck = null;
			try {
				sck = server.accept();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	// 접속 요청 시 수락
			
			InetSocketAddress addr = (InetSocketAddress)sck.getRemoteSocketAddress();
			System.out.println("접속 완료: "+addr.getAddress()+" : "+addr.getPort());

			try {
				server.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}			
		}//whileEnd

		
	}//mainEnd

}
