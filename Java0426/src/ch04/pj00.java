package ch04;

import java.util.Scanner;
import static java.lang.System.out;

public class pj00 {
   public static final Scanner scan = new Scanner(System.in);
   
   public static void main(String[] args) {
      int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};
      int total = 0;
      int month = 0;
      int day = 0;
      
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
      
      // 2월은 28일까지 있습니다. 
      // days[1] == 28
      out.printf("%d월은 %d일까지 있다.\n", month, days[month-1]);
 //----------------------------------------------------------------------------------------     
      // 1월 1일부터 4월10일까지는 100일입니다.
      // total = (1월 + 2월 + 3월) + 10일
      total = 0;
      for(int i=0; i<month-1; i++) {
         total += days[i];
      }
      total += day;
      out.printf("1월1일부터 %d월%d일까지는 %d일입니다.\n", month, day, total);
      
      // 4월10일부터 12월31일까지는 265일 남았습니다.
      // 4월 날짜수 - day + (5월 + 6월 + 7월 + 8월 + 9월 + 10월 + 11월 + 12월)
      total = days[month-1] - day;
      for(int i=month; i<12; i++) {
         total += days[i];
      }
      out.printf("%d월%d일부터 12월31일까지는 %d일 남았습니다.\n", month, day, total);
      
      // 과제:
      // 4월 10일의 100일 후는 ?월?일입니다.
      // 단 12월이상이면 다시 1월부터 돌아가게 한다.
      // Calendar클래스나 Date 클래스 사용 하지 말것.
      // 윤달 없슴.
      // 오로지 반복문과 배열만 사용해서 연습 한다.      
   }

}
