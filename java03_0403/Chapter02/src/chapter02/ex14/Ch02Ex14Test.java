package chapter02.ex14;

import java.io.PrintStream;
import java.util.Scanner;

public class Ch02Ex14Test {

	   public static PrintStream printf(String format, Object ... args) {
	        PrintStream out;
			return out.format(format, args);
 }

	
	   public static void main(String[] args) {
		      // 월을 입력 받아서 해당 월은 몇일까지인지 출력한다.
		      // switch~case로 구현
		      // 예)
		      // 월입력 : 2
		      // 2월은 28일까지입니다.
		      int month = 0;
		      int day = 31;
		      
		      System.out.print("월 입력: ");
		      Scanner scan;
			month = scan.nextInt();
		      while(month<1 || month>12) {
		         System.out.println("잘못 입력 했습니다. 월의 범위는 1~12사이 입니다.");
		         System.out.print("다시 입력: ");
		         month = scan.nextInt();
		      }
		      
		      switch(month) { //논리 값이 아닌 정수 or 문자열 값을 입력한다. 
		      case 2 : day = 28; break;
		      case 4 : case 6 : case 9 : case 11 : day = 30; break;
		      default : System.out.println("해당사항 없습니다!");
		      }
		      
		      // printf는 print format
		      // C언어의 출력함수 printf()와 사용법이 동일 함.
		      System.out.printf("%d월은 %d일까지 있다\n", month, day);
		   }
}
	   