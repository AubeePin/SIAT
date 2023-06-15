package org.comstudy.ch20;

import static java.lang.System.*;

import java.io.IOException;

public class Ch20Ex01 {
   public static void main(String[] args) throws IOException {
      // EOF : End Of File (단축키는 Ctrl + z)
      out.println("데이터 입력(Ctrl + z 는 끝) : ");
      
      int data = 0;
      while((data = in.read()) != -1) {
         // out.print((char)(data));
         // out.print() 대신 파일 출력
         
      }
      out.println("----- 입력 완료! -----");
   }
}