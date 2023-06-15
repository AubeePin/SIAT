package ch15Ex02;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class ClientSocketEx02 {
	private Socket socket;
	private DataInputStream dataInputStream;
	private DataOutputStream dataOutputStream;
	
	public ClientSocketEx02() {
		try {
			socket = new Socket("127.0.0.1",8000);
			System.out.println(">>>서버에 연결성공!");
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}

	public static void main(String[] args) {
		new ClientSocketEx02();
	}

}
