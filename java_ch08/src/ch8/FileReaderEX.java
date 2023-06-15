package ch8;

import java.io.*;

public class FileReaderEX {

	public static void main(String[] args) throws IOException {
		FileReader fin = null;
		try {
			fin = new FileReader("D:\\system.ini");
			int c;
			while((c=fin.read())!= -1) { // 한 문자씩 파일 끝까지 읽는다.
				System.out.println((char)c);
			}
		} catch (IOException e) {
			
			System.out.println("입출력 오류");
		}

	}

}
