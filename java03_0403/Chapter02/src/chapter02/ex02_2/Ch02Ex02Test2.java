package chapter02.ex02_2;

import java.util.Scanner;

public class Ch02Ex02Test2 {
	//전역필드는 자동 초기화 된다.
	//참조변수는 null로 초기화, 기본 타입은 0으로 초기화 된다.
	//boolean은 false
	public static Scanner scan= new Scanner(System.in);

	public static void main(String[] args) {
		// 반지름을 입력 받아서 원의 둘레의 길이와 넓이를 구하는 프로그램
		//반지름 입력 변수
		double r = .0; //반지름의 숫자 넣어서?
		double area = .0; //면적
		double line = .0; //둘레길이
		
		
		//입력
		System.out.println("반지름 입력: ");
		r = scan.nextDouble();
		//연산 
		
		//area = Math.PI*Math.pow(r, 2);
		//area = Math.PI*r*r;
		area = Math.PI*r*r;
		line = Math.PI*r*2;
		//출력
		System.out.println("원의 면적: " + area);
		System.out.println("원의 둘레: " + line);
	}

}
