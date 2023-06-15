package java0509_10;

import java.util.Scanner;

public class dlatl {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("정수 3개를 입력하시오>> ");
		
		int a =scan.nextInt();
		int b =scan.nextInt();
		int c =scan.nextInt();
		
		if (a==0 || b==0 || c==0 ){
			System.out.println("삼각형이 될수 없습니다.");
		}else if(a+b>c||a+c>b||b+c>a){
			System.out.println("삼각형이 됩니다");
		}

	}

}
