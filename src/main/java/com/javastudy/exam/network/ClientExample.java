package com.javastudy.exam.network;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;

public class ClientExample {
	public static void main(String[] args) {
		Socket socket = null;
		try {
			socket = new Socket();
			System.out.println( "[연결 요청]");
			socket.connect(new InetSocketAddress("localhost", 5001));
			System.out.println( "[연결 성공]");
			int i = 0;
			while (true) {
				Thread.sleep(1*1000);
				if (i > 12) break;
				System.out.println( " [ 작업중 ]"+i);
				i++;
			}

		} catch(Exception e) {}
		
		if(!socket.isClosed()) {
			try {
				System.out.println( "[연결 종료]");
				socket.close();
			} catch (IOException e1) {}
		}	
	}
}