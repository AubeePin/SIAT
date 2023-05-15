package ch04;

import static java.lang.System.out;

import java.util.Scanner;

public class pj01 {
	public static final Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};
	      int total = 0;
	      int month = 0;
	      int day = 0;
	 //--------------------------------------------------------     
	      // days의 모든 요소 값을 total에 누적 해 보기
	      for(int i=0; i<days.length; i++) {
	         total += days[i];
	      }
	      
	      // 1년은 365일입니다.
	      out.printf("1년은 %d일입니다.\n", total);
	      
	      out.print("월 입력: ");
	      month = scan.nextInt();
	      out.print("일 입력: ");
	      day = scan.nextInt();
	      
	      out.printf("오늘은 %d월 %d일 입니다.\n",month,day);
	      
	      total=day+days[month-1];
	      for(int i=0; i<100; i++) {
	    	total++;
	    	
	      }
	      out.printf("100일후는 %d월 %d일 입니다.",month,day);
	}

}
