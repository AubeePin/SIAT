package ch02;

import java.util.Scanner;

public class pj06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("1~99 사이의 정수를 입력하세요>>");
		
		int num = scan.nextInt();
		if (num==3|| num==6||num==9) {
			System.out.println("박수 짝");
		}else if(num%10==3 || num%10==6 || num%10==9){// 이것이 먼저 충족되면 밑에꺼 나오지않고
			System.out.println("박수 짝짝");				// 이거 충족안되면 밑에꺼 확인하게 됨.
		}else if(num/10==3 || num/10==6 || num/10==9) {//십의자리만 3,6,9 이면 짝 하나 나옵니다.
			System.out.println("박수 짝");
		}
	}
	
}
