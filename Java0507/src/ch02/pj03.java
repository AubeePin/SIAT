package ch02;

import java.util.Scanner;

public class pj03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("금액을 입력해주세요>>>");
		
		int num = scanner.nextInt();
		System.out.println("50000원 :" + num/50000 +"매");
		num%=50000;
		System.out.println("10000원 :" + num/10000 +"매");
		num%=10000;
		System.out.println("5000원 :" + num/5000 +"매");
		num%=5000;
		System.out.println("1000원 :" + num/1000 +"매");
		num%=1000;
		System.out.println("500원 :" + num/500 +"개");
		num%=500;
		System.out.println("100원 :" + num/100 +"개");
		num%=100;
		System.out.println("몇십짜리는 묶어서 :" + num + "원 입니다.");
	}

}
