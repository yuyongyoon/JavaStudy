package ch12.ex04;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.Socket;

public class RcvThread extends Thread {

	Socket sck = null;
	ObjectInputStream ois = null;
	
	public RcvThread(Socket sck) {
		this.sck = sck;
	}
	
	@Override
	public void run() {

		try {
			ois = new ObjectInputStream(sck.getInputStream());
			while(true) {
				String msg = ois.readUTF();			// 보낸 메세지 읽기
				System.out.println("상대방 : "+msg);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
			try {
				// 자원 정리
				ois.close();
				sck.close();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}
	
	}
	
	

	
}
