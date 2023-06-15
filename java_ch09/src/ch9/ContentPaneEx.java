package ch9;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ContentPaneEx extends JFrame{
	public ContentPaneEx() {
		setTitle("ContentPane�� JFrame"); //������ Ÿ��Ʋ �ޱ�
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //������ �����츦 ������ ���α׷��� �����ϵ��� ����
		
		Container contentPane = getContentPane(); //����Ʈ ���� �˾Ƴ���.
		//contentPane.setBackground(Color.white); //����Ʈ���� ���� �Ͼ������
		contentPane.setBackground(Color.ORANGE); //����Ʈ���� ���� ������������
		
		contentPane.setLayout(new FlowLayout()); //����Ʈ�ҿ� FlowLayout ��ġ������ �ޱ�
		//FlowLayout <--���ʿ��� ���������� ������Ʈ�� ũ��� ȭ�鿡 ��µ� �� �ִ� ������ ũ��� �˾Ƽ� ����.
		
		
		contentPane.add(new JButton("OK")); //OK��ư �ޱ�
		contentPane.add(new JButton("Cancel")); //Cancel��ư �ޱ�
		contentPane.add(new JButton("Ignore")); //Ignore��ư �ޱ�
		
		setSize(300,150); //ȭ�� ������ ũ�� 300 * 150 ����
		setVisible(true); //ȭ�鿡 ������ ���
	}

	public static void main(String[] args) {
		new ContentPaneEx();

	}

}
