package ch12.ex02;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client2 {

	public static void main(String[] args) throws FileNotFoundException {
		
		Socket client = null;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("[Client]");

		try {
			client = new Socket("localhost", 5500);

			OutputStream os = client.getOutputStream();
			ObjectOutputStream oos = new ObjectOutputStream(os);

			InputStream is = client.getInputStream();
			ObjectInputStream ois = new ObjectInputStream(is);
			
			// 메세지 보내기
			System.out.print("Client: ");
			String sndMsg = sc.nextLine();
//			System.out.print(sndMsg);
			oos.writeUTF(sndMsg);	

			// 메세지 읽기
			String rcvMsg = ois.readUTF();
			System.out.println("Server: "+rcvMsg);
			//*/

			System.out.println("클라이언트를 종료합니다.");
//			ois.close();
			oos.flush();
			oos.close();
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
