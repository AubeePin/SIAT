package org.comstudy.ch20;

import java.io.IOException;

public class Ch20Ex03 {

   public static void main(String[] args) throws IOException {
      byte[] by = new byte[255];
      
      System.out.print("입력: ");
      System.in.read(by);
      
      System.out.println("----------");
      // System.out.write(by);
      String inData = new String(by).trim();
      System.out.println(inData);
      System.out.println("출력 완료!");
   }

}