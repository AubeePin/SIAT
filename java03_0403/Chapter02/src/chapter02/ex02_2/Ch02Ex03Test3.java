package chapter02.ex02_2;

import java.util.Scanner;

public class Ch02Ex03Test3 {
	
	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		//����, ���� �Է� �޾Ƽ� �ﰢ���� ������ ���ϴ� ���α׷�
		double width = 0.0;
		double height = 0.0;
		double area = 0.0;
		
		//���μ��� �Է�
		System.out.println("�ﰢ�� ���� �Է�: ");
		width = scan.nextDouble();
		System.out.println("�ﰢ�� ���� �Է�: ");
		height = scan.nextDouble();
		//����
		area= width*height/2;
		//���
		System.out.println("����"+width +" x " + "����"+height +" /2");
		System.out.println("�ﰢ���� ���� : " + area);
	}

}
