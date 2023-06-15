package org.comstudy21.ch17;

import java.awt.Button;
import java.awt.Container;

import javax.swing.JFrame;

public class Ch17Ex06SwingEx extends JFrame {
   private Container content = null;
   
   public Ch17Ex06SwingEx() {
      // WindowClosing �̺�Ʈ �ڵ鷯 ȿ��
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      // JFrame���� �⺻ �г��� �̸� �پ� �ִ�.
      // �⺻ ���� �����ͼ� ����ϰų� ���ο� Panel�� ����� ���� �� �ִ�.
      content = this.getContentPane();
      content.add(new Button("Button"));
      
      setSize(640, 480);
   }

   public static void main(String[] args) {
      new Ch17Ex06SwingEx().setVisible(true);
   }

}