package ch12.ex01;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class GetIp {

	public static void main(String[] args) throws UnknownHostException {
		
		InetAddress addr = InetAddress.getLocalHost();
		String ip = addr.getHostAddress();
		System.out.println(ip);
		
		
	}

}
