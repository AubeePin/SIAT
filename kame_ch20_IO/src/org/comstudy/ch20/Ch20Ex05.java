package org.comstudy.ch20;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ch20Ex05 {
   
   public static void main(String[] args) throws IOException {
      File file = new File("D:\\person.txt");
      FileInputStream fis = new FileInputStream(file);
      InputStreamReader isr = new InputStreamReader(fis);
      BufferedReader br = new BufferedReader(isr);

      System.out.print("���� �Է�: ");
      String name = br.readLine();
      System.out.print("�ּ� �Է�: ");
      String address = br.readLine();
      System.out.print("���� �Է�: ");
      int age = Integer.parseInt(br.readLine());
      
      System.out.printf("%s, %s, %d\n", name, address, age);
   }

   public static void test05(String[] args) throws IOException {
      InputStreamReader isr = new InputStreamReader(System.in);
      BufferedReader br = new BufferedReader(isr);

      System.out.print("���� �Է�: ");
      String name = br.readLine();
      System.out.print("�ּ� �Է�: ");
      String address = br.readLine();
      System.out.print("���� �Է�: ");
      int age = Integer.parseInt(br.readLine());
      
      System.out.printf("%s, %s, %d\n", name, address, age);
   }

}