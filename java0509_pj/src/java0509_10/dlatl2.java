package java0509_10;

import java.util.Scanner;

public class dlatl2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("��(x,y)�� ��ǥ�� �Է��Ͻÿ�>>>");
		
		int x = scan.nextInt();
		int y = scan.nextInt();
		
		if(x>=100 && x<=200 && y>=100 && y<=200) {
			System.out.println("(" + x + ","+ y + ")"+"�� �簢�� �ȿ� �ֽ��ϴ�.");
		}else {
			System.out.println("�簢�� �ȿ� ���� �ʽ��ϴ�.");
		}
	}

}
