package ch8;

import java.io.*;

public class FileReaderEX {

	public static void main(String[] args) throws IOException {
		FileReader fin = null;
		try {
			fin = new FileReader("D:\\system.ini");
			int c;
			while((c=fin.read())!= -1) { // �� ���ھ� ���� ������ �д´�.
				System.out.println((char)c);
			}
		} catch (IOException e) {
			
			System.out.println("����� ����");
		}

	}

}
