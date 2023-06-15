package chapter02.ex02_2;

import java.util.Scanner;

public class Ch02Ex13Test {

   public static void main(String[] args) {
   
      Scanner scan = new Scanner(System.in);
      int a, b, c;
      // 지역변수는 초기값 필수, 멤버필드는 자동 초기값 생성.
      int max=0, mid=0, min=0;
      
      System.out.print("정수 3개 입력: ");
      a = Util.getNum();
      b = Util.getNum();
      c = Util.getNum();
      // 유효성 검사
      while(!(a != b && a != c && b != c)) {
         System.out.println("각각 다른 정수를 입력 하세요!");
         System.out.print("정수 3개 다시 입력: ");
         a = Util.getNum();
         b = Util.getNum();
         c = Util.getNum();
      }
      
      // 비교
      // 일단 max, min을 구별한다.
      if(a>b) {
         max = a;
         min = b;
      } else {
         max = b;
         min = a;
      }
      
      if(c>max) {
         mid = max;
         max = c;
      } else if(c<min) {
         mid = min;
         min = c;
      } else {
         mid = c;
      }
      
      // 출력 (포멧문자를 이용한 출력)
      System.out.printf("max=%d, mid=%d, min=%d\n", max, mid, min);
   }
} // end of class

   
  
      