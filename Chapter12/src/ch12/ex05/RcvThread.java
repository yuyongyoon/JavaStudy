package ch12.ex05;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.Socket;

public class RcvThread extends Thread {

	String rcver = null;
	Socket sck = null;
	ObjectInputStream ois = null;
	
	public RcvThread(String rcver, Socket sck) {
		this.sck = sck;
		this.rcver = rcver;
	}
	
	@Override
	public void run() {

		try {
			ois = new ObjectInputStream(sck.getInputStream());
			while(true) {
				String msg = ois.readUTF();			// 보낸 메세지 읽기
				System.out.println(rcver+" : "+msg);// 받는 사람 + 메세지 
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
