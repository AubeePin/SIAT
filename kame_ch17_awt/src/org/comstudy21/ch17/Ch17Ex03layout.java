package org.comstudy21.ch17;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;

public class Ch17Ex03layout extends MyFrame {
   private Button btn01 = new Button("FirstButton");
   private static Button[] btns = new Button[100];
   static {
      // static �ʱ�ȭ ��
      // ������ ���� ���� ���� �ȴ�.
      for(int i=0; i<btns.length; i++) {
         btns[i] = new Button("Button"+i);
      }
   }
   
   public Ch17Ex03layout(int w, int h) {
      super("�÷ο� ���̾ƿ�", w, h);
      
      // Frame�� �⺻ ��ġ�����ڴ� BorderLayout�̴�.
      // FlowLayout���� ����.
      
      // BorderLayout�� ����Ʈ ��ġ�� BorderLayout.CENTER
      //add(btn01, BorderLayout.NORTH);
      
      setLayout(new FlowLayout());
      add(btn01);
   }
   
   public static void main(String[] args) {
      new Ch17Ex03layout(640,480);
   }
}