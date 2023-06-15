package org.comstudy21.ch17;

import java.awt.Button;
import java.awt.GridLayout;

public class Ch17Ex04GridLayout extends MyFrame {
   
   private GridLayout gridLayout = new GridLayout(3, 4, 5, 10);
   private static Button[] btns = new Button[12];
   static {
      for(int i=0; i<btns.length; i++) {
         btns[i] = new Button("button"+i);
      }
   }

   public Ch17Ex04GridLayout(String title, int w, int h) {
      super(title, w, h);
      
      setLayout(gridLayout);
      for(int i=0; i<btns.length; i++) {
         add(btns[i]);
      }
      
      setVisible(true);
   }

   public static void main(String[] args) {
      new Ch17Ex04GridLayout("GridLayout Ex", 640,480);
   }

}