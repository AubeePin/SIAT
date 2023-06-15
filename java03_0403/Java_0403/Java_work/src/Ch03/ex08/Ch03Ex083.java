package Ch03.ex08;

import java.util.Scanner;

public class Ch03Ex083 {
	//int[] days = new int[] {};
	int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	Scanner scan = new Scanner(System.in);
	int month; //월 입력
	int day; //일 입력
	int total=0;

	public Ch03Ex083() {
		//ex01();
		ex02();
		ex03();
	}
	public void ex02() {
		//월/ 일을 입력 받아서 1년중 남은 남은 날짜를 출력한다.
	}
	public void ex01() {
		//month에 월 입력
		//month에 해당하는 월의 날짜수를 days배열에서 가져온다.
		System.out.println("월/일 입력: ");
		month = scan.nextInt();
		day = scan.nextInt();
		System.out.printf("%d월%d일로 부터 올해는 %d일 남앗다.\n",month, day,total);
	}
	public void ex03() {
		//month에 월 입력
		//month에 해당하는 월의 날짜수를 days배열에서 가져온다.
		System.out.println("월/일 입력: ");
		month = scan.nextInt();
		day = scan.nextInt();
		int nextMon, nextDay;
		//입력 월일로 부터 100일 후의 날짜는? 00월 00일
		//12월 25일의 100일 후는 4월 5일 입니다.
	}
	
	public static void main(String[] args) {
		new Ch03Ex083();

	}

}
