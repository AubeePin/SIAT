package org.comstudy.ch20;

import static java.lang.System.*;

import java.io.IOException;

public class Ch20Ex01 {
   public static void main(String[] args) throws IOException {
      // EOF : End Of File (����Ű�� Ctrl + z)
      out.println("������ �Է�(Ctrl + z �� ��) : ");
      
      int data = 0;
      while((data = in.read()) != -1) {
         // out.print((char)(data));
         // out.print() ��� ���� ���
         
      }
      out.println("----- �Է� �Ϸ�! -----");
   }
}