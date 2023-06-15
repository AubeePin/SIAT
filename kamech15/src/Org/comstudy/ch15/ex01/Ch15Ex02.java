package Org.comstudy.ch15.ex01;

public class Ch15Ex02 {
   // 질문이 공부여 이놈아 - 설경구
   public static void main(String[] args) {
      String str1 = "1|김범준|프로그래머|38";
      
      // StringBuffer는 오토박싱 지원 안함.
      // String의 오토박싱 결점을 보완하기 위해 새로 추가된 클래스이다.
      // 오토박싱 대신 new를 이용해서 객체 생성 해야 한다.
      // 꿍시렁 거리지 말 것 (오해 받으니까)
      //StringBuffer strbf = new StringBuffer(str1);
      StringBuffer strbf = new StringBuffer();
      strbf.append(str1);
      strbf.append("|comstudy21@naver.com");
      
      // 프로그래머 -> 개발자 변경
      String s = "프로그래머";
      int start = strbf.indexOf(s);
      int end = start + s.length();
      strbf.replace(start, end, "예술가");
      System.out.println(strbf);
      
      strbf.delete(strbf.indexOf("예술가"), strbf.indexOf("예술가")+"예술가|".length());
      
      System.out.println(strbf);
   }
   
   public static void test(String[] args) {
      String str1 = "1|김범준|프로그래머|38";
      
      int idx = str1.indexOf("프로그래머");
      System.out.println("idx = " + idx);
      
      // String은 불변 객체이므로 결과를 반환 받아야 한다.
      str1 = str1.replace("프로그래머", "개발자");
      System.out.println(str1);
   }
}