package chapter02.ex02_2;

import java.util.Scanner;

public class Ch02Ex03Test3 {
	
	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		//가로, 세로 입력 받아서 삼각형의 면적을 구하는 프로그램
		double width = 0.0;
		double height = 0.0;
		double area = 0.0;
		
		//가로세로 입력
		System.out.println("삼각형 가로 입력: ");
		width = scan.nextDouble();
		System.out.println("삼각형 세로 입력: ");
		height = scan.nextDouble();
		//연산
		area= width*height/2;
		//출력
		System.out.println("가로"+width +" x " + "세로"+height +" /2");
		System.out.println("삼각형의 면적 : " + area);
	}

}
