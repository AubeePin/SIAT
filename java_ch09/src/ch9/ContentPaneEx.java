package ch9;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ContentPaneEx extends JFrame{
	public ContentPaneEx() {
		setTitle("ContentPane과 JFrame"); //프레임 타이틀 달기
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //프레임 윈도우를 닫으면 프로그램을 종료하도록 설정
		
		Container contentPane = getContentPane(); //컨텐트 팬을 알아낸다.
		//contentPane.setBackground(Color.white); //컨텐트팬의 색을 하얀색으로
		contentPane.setBackground(Color.ORANGE); //컨텐트팬의 색을 오렌지색으로
		
		contentPane.setLayout(new FlowLayout()); //컨텐트팬에 FlowLayout 배치관리자 달기
		//FlowLayout <--왼쪽에서 오른쪽으로 컴포넌트의 크기는 화면에 출력될 수 있는 적당한 크기로 알아서 나옴.
		
		
		contentPane.add(new JButton("OK")); //OK버튼 달기
		contentPane.add(new JButton("Cancel")); //Cancel버튼 달기
		contentPane.add(new JButton("Ignore")); //Ignore버튼 달기
		
		setSize(300,150); //화면 프레임 크기 300 * 150 설정
		setVisible(true); //화면에 프레임 출력
	}

	public static void main(String[] args) {
		new ContentPaneEx();

	}

}
