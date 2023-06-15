package org.comstudy21.ch17;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ch17Ex01 {

   public static void main(String[] args) {
      Frame frame = new Frame();
      frame.setVisible(true);
      frame.setSize(640,480);
      frame.addWindowListener(new WindowAdapter() {
         @Override
         public void windowClosing(WindowEvent e) {
            System.exit(0);
         }
      });
   }
}