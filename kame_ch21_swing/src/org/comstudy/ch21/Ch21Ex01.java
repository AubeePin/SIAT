package org.comstudy.ch21;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Ch21Ex01 extends JFrame implements ActionListener {
   public static final JPanel contentPane;
   static {
      contentPane = new JPanel();
   }
   
   private JLabel lbl1 = new JLabel("이     름:");
   private JLabel lbl2 = new JLabel("아 이 디:");
   private JLabel lbl3 = new JLabel("패스워드:");
   private JLabel lbl4 = new JLabel("나     이:");
   
   private JTextField txt1 = new JTextField("", 20);
   private JTextField txt2 = new JTextField("", 20);
   private JTextField txt3 = new JTextField("", 20);
   private JTextField txt4 = new JTextField("", 20);
   
   private JButton btn1 = new JButton("가입하기");
   private JButton btn2 = new JButton("다시쓰기");

   private JPanel[] panes = new JPanel[5];
   {
      for(int i=0; i<panes.length; i++) {
         panes[i] = new JPanel();
      }
   }
   
   public Ch21Ex01() {
      setContentPane(contentPane);
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      
      layoutInit();
      
      btn1.addActionListener(this);

      setSize(400, 300);
   }

   private void layoutInit() {
      panes[0].add(lbl1);
      panes[0].add(txt1);
      panes[1].add(lbl2);
      panes[1].add(txt2);
      panes[2].add(lbl3);
      panes[2].add(txt3);
      panes[3].add(lbl4);
      panes[3].add(txt4);
      panes[4].add(btn1);
      panes[4].add(btn2);
      
      JPanel centerPane = new JPanel(new GridLayout(5, 1));
      centerPane.add(panes[0]);
      centerPane.add(panes[1]);
      centerPane.add(panes[2]);
      centerPane.add(panes[3]);
      centerPane.add(panes[4]);
      
      contentPane.setLayout(new FlowLayout());
      contentPane.add(centerPane);
   }

   public static void main(String[] args) {
      new Ch21Ex01().setVisible(true);
   }

   @Override
   public void actionPerformed(ActionEvent e) {
      JOptionPane.showMessageDialog(this, "가입이 성공적으로 완료 되었습니다.");
   }
}