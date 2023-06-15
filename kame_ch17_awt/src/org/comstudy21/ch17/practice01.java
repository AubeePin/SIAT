package org.comstudy21.ch17;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class practice01 extends JFrame implements ActionListener {
	   private JPanel contentPane = new JPanel(new BorderLayout());
	private JPanel centerPane = new JPanel(new GridBagLayout());
	   private JPanel southPane = new JPanel(new GridLayout(1, 3));
	   private JPanel sPane = new JPanel(new GridLayout(2, 1));
	private JLabel lbl = new JLabel("���⿡ �� �־�� ����?");
	private JButton btn1 = new JButton("���");
	private JButton btn2 = new JButton("����");
	private JButton btn3 = new JButton("��������");
	private JButton btn4 = new JButton("�ڷΰ���");
	

	  private Container content;
	   
	   public practice01() {
	      setDefaultCloseOperation(EXIT_ON_CLOSE);
	      content = getContentPane();

	      contentPane.add(centerPane);
	      contentPane.add(BorderLayout.SOUTH, southPane);

		 centerPane.add(lbl);
	      southPane.add(btn1);
	      southPane.add(btn2);
	      southPane.add(sPane);
	      sPane.add(btn3);
	      sPane.add(btn4);
	      content.setLayout(new BorderLayout());
	      content.add(centerPane);
	      content.add(BorderLayout.SOUTH, southPane);
	      btn1.addActionListener(this);
	      // <-�������̵� �ֱ����� �̰��� �Է����Ŀ� ������ ������ ���°� �ϳ��������� �ذ��ϱ�.
	      btn2.addActionListener(this);
	      btn3.addActionListener(this);
	      btn4.addActionListener(this);
	      
	      setTitle("�������Դϴ�.");
	      setSize(640, 480);
	      setVisible(true);
	}

	public static void main(String[] args) {
		practice01 frame = new practice01();
	      
	      System.out.println(frame instanceof practice01);
	      System.out.println(frame instanceof JFrame);
	      System.out.println(frame instanceof ActionListener);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() instanceof JButton) {
			JButton target = (JButton)e.getSource();
			
			if(target.equals(btn1)) {
				//System.out.println("���");
				lbl.setText("���");
			}else if(target.equals(btn2)) {
				//System.out.println("����");
				lbl.setText("����");
			}else if(target.equals(btn3)) {
				//System.out.println("��������");
				lbl.setText("��������");
			}else if(target.equals(btn4)) {
			//System.out.println("�ڷΰ���");
				lbl.setText("�ڷΰ���");
			}
		}
	}
}
