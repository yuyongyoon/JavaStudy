package ch12.ex05;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class SndThread extends Thread {

	String snder = null;
	Socket sck = null;
	ObjectOutputStream oos = null;
	
	public SndThread(String snder, Socket sck) {
		this.sck = sck;
		this.snder = snder;
	}
	
	@Override
	public void run() {

		try {
			oos = new ObjectOutputStream(sck.getOutputStream());
			Scanner sc = new Scanner(System.in);
			while(true) {
				String msg = sc.nextLine();				// 보낼 메세지 입력
				oos.writeUTF(msg);						// 상대에게 보내기
				System.out.println(snder +" : "+msg);	// 보낸 사람 + 메세지
				oos.flush();
				sc.close();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
			try {
				// 자원 정리
				oos.close();
				sck.close();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}
	
	}
	
	

	
}
