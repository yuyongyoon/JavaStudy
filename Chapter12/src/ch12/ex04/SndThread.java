package ch12.ex04;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class SndThread extends Thread {

	Socket sck = null;
	ObjectOutputStream oos = null;
	Scanner sc = null;
	
	public SndThread(Socket sck) {
		this.sck = sck;
	}
	
	@Override
	public void run() {

		try {
			oos = new ObjectOutputStream(sck.getOutputStream());
			sc = new Scanner(System.in);
			while(true) {
				String msg = sc.nextLine();				// 보낼 메세지 입력
				oos.writeUTF(msg);						// 상대에게 보내기
				System.out.println("상대방 : "+msg);
				oos.flush();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
			try {
				// 자원 정리
				oos.close();
				sck.close();
				sc.close();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}
	
	}
	
	

	
}
