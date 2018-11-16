package com.littlehu.test04;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class GreetingServer{
	private ServerSocket serverSocket;
	
	public GreetingServer(int port)throws IOException{
		serverSocket=new ServerSocket(port);
		serverSocket.setSoTimeout(1000000000);
		
	}
	
	public void run() {
//		while(true){
		try {
			System.out.println("Waiting for client on port"+serverSocket.getLocalPort()+"...");
			Socket server=serverSocket.accept();
			System.out.println("server is"+server.toString());
			if (server!=null) {
				
				System.out.println("Just connected to"+server.getRemoteSocketAddress());
				DataInputStream dis=new DataInputStream(server.getInputStream());
				System.out.println(dis.readUTF());
				DataOutputStream dos=new DataOutputStream(server.getOutputStream());
				dos.writeUTF("Thank you for connecting to"+server.getLocalSocketAddress()+"\nGoodBye!");
				server.close();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		

		}
//	}
	
	public static void main(String[] args) {
		int port=Integer.parseInt("8081");
//		Thread t = null;
//		try {
			GreetingServer t;
			try {
				t = new GreetingServer(port);
				t.run();
			} catch (IOException e) {
				e.printStackTrace();
			}
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
	}

}
