package ch12.ex05;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class WebServer {

	public static void main(String[] args) throws IOException {

		// thread poll 생성
		int n = Runtime.getRuntime().availableProcessors();
		ExecutorService pool = Executors.newFixedThreadPool(n);
		
		// 서버 소켓 생성
		ServerSocket server = new ServerSocket(8080);
		
		// scanner 생성
		Scanner sc = new Scanner(System.in);

		System.out.println("[Server]");
		
		while(true) {
			// 서버 소켓 생성
			System.out.println("접속 대기중...");
			
			// 요청 수락
			Socket sck = server.accept();
			System.out.println("접속 수락!");
			
			// thread가 브라우저에 보낸 내용 받음
			Runnable run = new Runnable() {
				public void run() {
					try {
						// 입력한 데이터 읽기
						// 보조 + 주 스트림
						DataInputStream dis = new DataInputStream(sck.getInputStream());
						
						byte[] buf = new byte[65536];	// http protocol에서 받을 수 있는 최대 byte수 = 65536
						dis.read(buf);					// 받은 내용 읽기
						
						// 받은 byte 문자열화
						String request = new String(buf);
						System.out.println(request);
						
						// response: 직접 기록하는 보조스트림
						PrintStream ps = new PrintStream(sck.getOutputStream());
						// header
						ps.print("HTTP/1.1 200 \r\n");				// http 1.1 버전으로 통신(200=정상)
						ps.print("Content-type: text/html \r\n");	// 응답할 content type
						ps.print("\r\n");
						// body
						String msg = "<h3>Success Receive</h3>";
						ps.print(msg);
						
						// 종료
						ps.flush();
						dis.close();
						ps.close();
						sck.close();
						
					} catch (IOException e) {
						e.printStackTrace();
					}//try-catchEnd
					
				}//runEnd
			};//runnabelEnd
			
			pool.execute(run);
			
			
		}//whileEnd
		
	}//mainEnd

}
