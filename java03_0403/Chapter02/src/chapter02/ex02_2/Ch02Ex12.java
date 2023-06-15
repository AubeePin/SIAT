package chapter02.ex02_2;

import java.io.IOException;
import java.util.Scanner;

public class Ch02Ex12 {
   // 같은 패키지의 같은 클래스에서만 사용되는 필드는 접근지정자 생략가능.
   static Scanner scan = new Scanner(System.in);
   
   public static int getNum() throws IOException {
      int num = 0;
      // '0'은 48 ~
      // '0' ~ '9' 사이만 처리
      int ch = 0;
      while((ch = System.in.read()) != '\n') { // Enter가 아니라면 반복한다.
         // '0' == 48
         // 만약 ch에 '1'이라면 49. 숫자 1로 바뀌려면 49-'0'
         // 키로 입력 받은 아스키값을 숫자로 변환.
         if(ch>='0' && ch<='9') {
            // ch가 문자 '0' ~ '9'사이만 처리 됨.
            //(num을 10의 자리로 바꾼다)
            // 90 + 7
            // 970 + 8
            // 먼저 입력된 숫자 자릿수 증가 + 현재 입력 된 숫자
            num = (num*10) + (ch-'0');
         }
      }
      // Enter가 입력 되어서 반복이 끝났다.
      return num;
   }
   
   public static void main(String[] args) throws IOException {
      // 성적을 입력 받아서 학점을 출력하는 프로그램
      int score = 0;
      String grade = "F";
      
      System.out.print("점수입력: ");
      score = getNum();
      System.out.print(score+"점은 ");
      
      // 무한 루프를 이용한 유효성 검사
      // 가비지 in 가비지 out - 쓰레가 들어가면 쓰레기가 나온다.
      // 필터이다.
      while (score<0 || score>100) {
         System.out.println("오류! 범위 초과 했습니다. 다시 입력!");
         System.out.print("점수입력: ");
         score = getNum();
      }
      
      if (score >= 90) {
         grade = "A";
      } else if (score >= 80) {
         grade = "B";
      } else if (score >= 70) {
         grade = "C";
      } else if (score >= 60) {
         grade = "D";
      }
      
      // +또는 -붙이기
      // 1의자리만 추출해서 비교한다. %연산자 활용 (나머지 연산)
      int num = score % 10;
      if(score >= 60) {
         if(score == 100 || num >= 7) {
            grade += "+";
         } else if(num <= 3) {
            grade += "-";
         }
      }
      System.out.println(grade + "입니다.");
      
      System.out.println("재 시도 하겠습니까?");
      System.out.print("Y또는 N입력 : ");
      String yn = scan.next();
      // 유효성 검사 추가
      while(!( "Y".equals(yn.toUpperCase()) || "N".equals(yn.toUpperCase()) )) {
         System.out.println("입력 오류! Y또는 N만 입력하세요!");
         System.out.print("Y또는 N입력 : ");
         yn = scan.next();
      }
      // 자바열에서 문자열 비교는 equals()로 한다.
      // String도 클래스이다. 그러므로 문자열은 객체이다.
      //if(yn.equals("Y"))
      // null pointer 예외 발생이 줄어든다.
      if("Y".equals(yn.toUpperCase())) {
         // 아는만큼 보인다.
         // 정중지와 - 우물안 개구리... 무조건 겸손해야 한다!
         System.out.println("재실행 하겠습니다.");
         main(args); // main도 함수이기 때문에 그냥 호출 한다. (재귀호출)
      } else {
         System.out.println("프로그램 종료!");
         System.out.println("수고하셨습니다!");
      }
   }

}