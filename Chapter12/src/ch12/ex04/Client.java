package ch12.ex04;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) throws FileNotFoundException {
		
		int port = 5000;
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
			SndThread sender = new SndThread(client);
			sender.start();
			
			// 메세지 읽기
			RcvThread receiver = new RcvThread(client);
			receiver.start();
			
									
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
		

	}

}
