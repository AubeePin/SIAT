package Ch03.ex08;

import java.util.Scanner;

public class Ch03Ex083 {
	//int[] days = new int[] {};
	int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	Scanner scan = new Scanner(System.in);
	int month; //�� �Է�
	int day; //�� �Է�
	int total=0;

	public Ch03Ex083() {
		//ex01();
		ex02();
		ex03();
	}
	public void ex02() {
		//��/ ���� �Է� �޾Ƽ� 1���� ���� ���� ��¥�� ����Ѵ�.
	}
	public void ex01() {
		//month�� �� �Է�
		//month�� �ش��ϴ� ���� ��¥���� days�迭���� �����´�.
		System.out.println("��/�� �Է�: ");
		month = scan.nextInt();
		day = scan.nextInt();
		System.out.printf("%d��%d�Ϸ� ���� ���ش� %d�� ���Ѵ�.\n",month, day,total);
	}
	public void ex03() {
		//month�� �� �Է�
		//month�� �ش��ϴ� ���� ��¥���� days�迭���� �����´�.
		System.out.println("��/�� �Է�: ");
		month = scan.nextInt();
		day = scan.nextInt();
		int nextMon, nextDay;
		//�Է� ���Ϸ� ���� 100�� ���� ��¥��? 00�� 00��
		//12�� 25���� 100�� �Ĵ� 4�� 5�� �Դϴ�.
	}
	
	public static void main(String[] args) {
		new Ch03Ex083();

	}

}
