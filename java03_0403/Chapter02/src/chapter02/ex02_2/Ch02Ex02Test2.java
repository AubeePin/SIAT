package chapter02.ex02_2;

import java.util.Scanner;

public class Ch02Ex02Test2 {
	//�����ʵ�� �ڵ� �ʱ�ȭ �ȴ�.
	//���������� null�� �ʱ�ȭ, �⺻ Ÿ���� 0���� �ʱ�ȭ �ȴ�.
	//boolean�� false
	public static Scanner scan= new Scanner(System.in);

	public static void main(String[] args) {
		// �������� �Է� �޾Ƽ� ���� �ѷ��� ���̿� ���̸� ���ϴ� ���α׷�
		//������ �Է� ����
		double r = .0; //�������� ���� �־?
		double area = .0; //����
		double line = .0; //�ѷ�����
		
		
		//�Է�
		System.out.println("������ �Է�: ");
		r = scan.nextDouble();
		//���� 
		
		//area = Math.PI*Math.pow(r, 2);
		//area = Math.PI*r*r;
		area = Math.PI*r*r;
		line = Math.PI*r*2;
		//���
		System.out.println("���� ����: " + area);
		System.out.println("���� �ѷ�: " + line);
	}

}
