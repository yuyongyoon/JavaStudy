package ch12.ex05;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class WebClient {

	public static void main(String[] args) throws FileNotFoundException {
		
		int port = 8080;
		String ip = "192.168.70.111";
		Socket client = null;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("[Client]");

		try {
			// 소켓 생성
			client = new Socket(ip, port);
			System.out.println("접속 성공!");
			
			// 스트림
			
			// 메세지 보내기
			SndThread sender = new SndThread("client", client);
			sender.start();
			
			// 메세지 읽기
			RcvThread receiver = new RcvThread("client", client);
			receiver.start();
			
			
			
			// 종료
			
			try {
				client.close();
				
			} catch (IOException e) {
				e.printStackTrace();
			}
						
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
		

	}

}
