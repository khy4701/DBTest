package Client;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;

public class ClientThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Socket socket = new Socket();
		
		try {
			System.out.println("[연결 요청]");
			socket.connect(new InetSocketAddress("localhost", 5001));
			System.out.println("[연결 성공]");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(!socket.isClosed())
		{
			try {
				socket.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
