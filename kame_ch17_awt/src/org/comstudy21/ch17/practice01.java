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
	private JLabel lbl = new JLabel("여기에 뭘 넣어야 하지?");
	private JButton btn1 = new JButton("재생");
	private JButton btn2 = new JButton("멈춤");
	private JButton btn3 = new JButton("빨리감기");
	private JButton btn4 = new JButton("뒤로감기");
	

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
	      // <-오버라이드 넣기위해 이것을 입력한후에 맨위에 빨간줄 나온게 하나있을거임 해결하기.
	      btn2.addActionListener(this);
	      btn3.addActionListener(this);
	      btn4.addActionListener(this);
	      
	      setTitle("연습장입니다.");
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
				//System.out.println("재생");
				lbl.setText("재생");
			}else if(target.equals(btn2)) {
				//System.out.println("멈춤");
				lbl.setText("멈춤");
			}else if(target.equals(btn3)) {
				//System.out.println("빨리감기");
				lbl.setText("빨리감기");
			}else if(target.equals(btn4)) {
			//System.out.println("뒤로감기");
				lbl.setText("뒤로감기");
			}
		}
	}
}
