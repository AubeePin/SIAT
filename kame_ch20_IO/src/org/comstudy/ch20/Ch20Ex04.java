package org.comstudy.ch20;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Ch20Ex04 {
   
   public static void main(String[] args) throws IOException {
	  File file = new File("D:\\test_data.txt");
	  if(!file.exists()) {
		  System.err.println("���� : ������ �������� �ʽ��ϴ�.");
		  if(file.createNewFile()) {
			  System.out.println("�� ������ ���� �Ǿ����ϴ�.");
		  }
		  //return;
	  }
	  
      InputStream myIn = new FileInputStream("D:\\test_data.txt");
      OutputStream myOut = System.out;
      
      int data = 0;
      while((data = myIn.read()) != -1) {
         myOut.write(data);
      }
      
      myIn.close();
      myOut.close();
      System.out.println("----- �Ϸ� -----");
   }
   
   public static void test2(String[] args) throws IOException {
      InputStream myIn = System.in;
      //OutputStream myOut = System.out;
      OutputStream myOut = new FileOutputStream("D:\\test_data.txt");
      
      int data = 0;
      while((data = myIn.read()) != -1) {
         myOut.write(data);
      }
      
      myOut.close();
      System.out.println("----- �Ϸ� -----");
   }

   public static void test(String[] args) throws IOException {
      InputStream myIn = System.in;
      OutputStream myOut = System.out;
      
      int data = 0;
      while((data = myIn.read()) != -1) {
         myOut.write(data);
      }
      
      System.out.println("----- �Ϸ� -----");
   }

}