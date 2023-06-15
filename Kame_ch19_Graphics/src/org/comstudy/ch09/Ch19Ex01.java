package org.comstudy.ch09;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JFrame;

public class Ch19Ex01 extends JFrame {
	
	Container container;
	
	public Ch19Ex01() {
		container = getContentPane();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setSize(new Dimension(800,600));
		setVisible(true);
	}
	@Override
	public void paint(Graphics g) {
		String str = "Hello Jave GUI world";
		int x= 100, y = 100;
		
		g.setColor(Color.GREEN);
		Font font = new Font("±Ã¼­", Font.BOLD,36);
		g.setFont(font);
		
		g.drawRect(100, 100, 200, 200);
		g.drawString("Hello world", x, y);
	}

	public static void main(String[] args) {
		new Ch19Ex01();
	}

}
