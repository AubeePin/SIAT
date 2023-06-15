package ch9;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class pj02 extends JFrame{
	public pj02() {
		setTitle("BorderLayout Practice");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		
		
		c.add(new JButton("1"), BorderLayout.WEST);
		
		
		setSize(600,300);
		setVisible(true);	
	}
	public static void main(String[] args) {
		new pj02();

	}

}
