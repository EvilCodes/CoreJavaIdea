package com.littlehu.test04;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class GreetingClient {
	public static void main(String[] args) {
		String serverName="localhost";
		int port=Integer.parseInt("8081");
		System.out.println("Connecting to "+serverName+"on port "+port);
		try {
			Socket client=new Socket(serverName,port);
			System.out.println("Just connected to"+client.getRemoteSocketAddress());
			OutputStream os = client.getOutputStream();
			DataOutputStream dos=new DataOutputStream(os);
			dos.writeUTF("Hello form"+client.getLocalAddress());
			InputStream is = client.getInputStream();
			DataInputStream dis=new DataInputStream(is);
			System.out.println("Server says"+dis.readUTF());
			client.close();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}

}
