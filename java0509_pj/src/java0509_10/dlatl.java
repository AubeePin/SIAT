package java0509_10;

import java.util.Scanner;

public class dlatl {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("���� 3���� �Է��Ͻÿ�>> ");
		
		int a =scan.nextInt();
		int b =scan.nextInt();
		int c =scan.nextInt();
		
		if (a==0 || b==0 || c==0 ){
			System.out.println("�ﰢ���� �ɼ� �����ϴ�.");
		}else if(a+b>c||a+c>b||b+c>a){
			System.out.println("�ﰢ���� �˴ϴ�");
		}

	}

}
