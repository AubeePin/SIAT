package ch9;

import javax.swing.JFrame;

public class MyFrame extends JFrame{
	public MyFrame() {
		setTitle("300 x 300 ���� ������ �����");
		setSize(300,300);//������ ũ�� 300 * 300
		setVisible(true);//������ ���
	}

	public static void main(String[] args) {
		MyFrame frame = new MyFrame();
	}

}