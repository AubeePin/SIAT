package org.comstudy.ch20;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ch20Ex06 {

	public static void main(String[] args) throws IOException {
		File file = new File("D:\\person.txt");
		FileWriter fw = new FileWriter(file, true);//����Ҷ����� ���α׷��� ���ڰ� �߰��˴ϴ�.
		fw.write("���α׷���");
		fw.close();
		
		test(null);
	}
	public static void test(String[] args) throws IOException {
		File file = new File("D:\\person.txt");
		FileReader fr = new FileReader(file);
		Scanner fscan = new Scanner(fr);
		
		while(fscan.hasNextLine()) {
			System.out.println(fscan.nextLine());
		}
		
		fscan.close();
		fr.close();
		
	}

}
