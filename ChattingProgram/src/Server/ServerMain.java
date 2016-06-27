package Server;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerMain {

		
	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		ServerSocket server_socket = null;

		try {
			server_socket = new ServerSocket();			
			server_socket.bind(new InetSocketAddress("localhost", 5001));
			
			while(true)
			{
				System.out.println("Waiting..");
				Socket socket = server_socket.accept();
				
				InetSocketAddress isa = (InetSocketAddress) socket.getRemoteSocketAddress();
				System.out.println(" [연결 수락함 ]" + isa);
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(!server_socket.isClosed())
		{
			try {
				server_socket.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
	
}
