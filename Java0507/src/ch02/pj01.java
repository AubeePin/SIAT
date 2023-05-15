package ch02;
import java.util.Scanner;

public class pj01 {
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("원화를 입력하세요(단위 : 원)>>> ");
		
		int won = scanner.nextInt();
		double dd = won/1100;
		System.out.println(won + "원은 $"+ dd+" 입니다.");
		scanner.close();
	}

}
