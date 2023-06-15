package org.comstudy21.ch18;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ch18Ex01 extends JFrame implements ActionListener {
   private JPanel contentPane = new JPanel(new BorderLayout());
   
   private JLabel lbl = new JLabel("[���]: �ƹ��� ��ư�� ������ �ʾҴ�.");
   private JButton btn1 = new JButton("��ư1");
   private JButton btn2 = new JButton("��ư2");
   private JPanel centerPane = new JPanel();
   private JPanel southPane = new JPanel();
   
   public Ch18Ex01() {
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      setContentPane(contentPane);
      
      contentPane.add(centerPane);
      contentPane.add(BorderLayout.SOUTH, southPane);
      
      centerPane.add(lbl);
      southPane.add(btn1);
      southPane.add(btn2);
      
      setSize(300,100);
      setVisible(true);
      
      btn1.addActionListener(this);
      btn2.addActionListener(this);
   }
   
   @Override
   public void actionPerformed(ActionEvent e) {
      if(e.getSource() instanceof JButton) {
         JButton target  = (JButton)e.getSource();
         //System.out.println(target.getText() + "Ŭ���ߴ�.");
         
         if(target.equals(btn1)) {
            System.out.println("[���] ù��° ��ư Ŭ��!");
         } else if(target.equals(btn2)) {
            System.out.println("[���] �ι�° ��ư Ŭ��!");
         }
      }
   }

   public static void main(String[] args) {
      Ch18Ex01 frame = new Ch18Ex01();
      
      System.out.println(frame instanceof Ch18Ex01);
      System.out.println(frame instanceof JFrame);
      System.out.println(frame instanceof ActionListener);
   }
}