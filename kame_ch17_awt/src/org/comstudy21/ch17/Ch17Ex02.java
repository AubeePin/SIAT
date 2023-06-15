package org.comstudy21.ch17;

import java.awt.Button;

public class Ch17Ex02 extends MyFrame {

   public Ch17Ex02(String title, int w, int h) {
      super(title, w, h);
      
      setLayout(null);
      Button btn = new Button("Ok Button");
      this.add(btn);
      btn.setBounds(100, 100, 100, 40);
   }

   public static void main(String[] args) {
      new Ch17Ex02("고객 관리 시스템", 640, 480);
   }
}