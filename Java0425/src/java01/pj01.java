package java01;

import java.util.Scanner;

public class pj01 {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("원화를 입력하세요(단위: 원)>>> ");

		int exch = scanner.nextInt();
		
		double won = 1100;
		double dd = exch/won;
		System.out.println(exch+"원은 "+"$"+dd+" 입니다.");
	}

}
