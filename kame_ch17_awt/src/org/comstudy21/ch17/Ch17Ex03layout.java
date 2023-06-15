package org.comstudy21.ch17;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;

public class Ch17Ex03layout extends MyFrame {
   private Button btn01 = new Button("FirstButton");
   private static Button[] btns = new Button[100];
   static {
      // static 초기화 블럭
      // 생성자 보다 먼저 실행 된다.
      for(int i=0; i<btns.length; i++) {
         btns[i] = new Button("Button"+i);
      }
   }
   
   public Ch17Ex03layout(int w, int h) {
      super("플로우 레이아웃", w, h);
      
      // Frame의 기본 배치관리자는 BorderLayout이다.
      // FlowLayout으로 변경.
      
      // BorderLayout의 디폴트 위치는 BorderLayout.CENTER
      //add(btn01, BorderLayout.NORTH);
      
      setLayout(new FlowLayout());
      add(btn01);
   }
   
   public static void main(String[] args) {
      new Ch17Ex03layout(640,480);
   }
}