package chapter02.ex02_2;

import java.util.Scanner;

//Ŭ������� ���ϸ��� ���ƾ� �Ѵ�.
public class Ch02Ex02 {
	public Ch02Ex02() {
		// TODO Auto-generated constructor stub
		System.out.println("����Ʈ ������ ȣ��");
	}
	//public ��ü �ܺο��� ���� ����, ����� �޼ҵ� ���鶧 �ַ� public ���δ�.
	//private ������, ��ü�ܺο��� ���� �Ұ���. (ĸ��ȭ) �ʵ� �տ� �ַ� ����.
	
	final static double PI = Math.PI;//(CLASS) �ɹ� �ʵ�
	public String title = "���� ���� ���ϴ� ���α׷�";
	public static void main(String[] args) {// �Ű� ����
		//final double PI = Math.PI; //(METHOD) ���� ����
		
		//����, ����
		// static �޼��� �ȿ��� �ܺ��� none-static ��� ���� �Ұ�.
		//System.out.println(PI);
		
		Scanner scan = new Scanner(System.in);
		System.out.println("���� �Է�: ");
		String name = scan.next();
		System.out.println("������ " + name);
	}
	
	public static void �⼳01(String[] args) {
		
		//wysyg :���� ���̴� ��� ���������. 
		//HTML, CSS, JS �ڵ� ���� ��(������������,  Adobe �帲����)
		//�ڹ� �ҽ��ڵ� �ڵ� ���� : �ػ�ũ��, �����÷���
		
		
	}

}
