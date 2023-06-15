//package ch04_exerclse;
//
//
//class TV { // 기본으로 extends Object가 상속 받아 진다.
//   private int size;
//   private String manufacturer;
//   
//   public TV() {
//      this(32, "LG");
//   }
//
//   public TV(String manufacturer) {
//      this(32, manufacturer);
//   }
//
//   public TV(int size, String manufacturer) {
//      this.size = size;
//      this.manufacturer = manufacturer;
//      System.out.println(size + "인치 " + manufacturer);
//   }
//
//   @Override
//   public String toString() {
//      return "{\"size\":" + size + ", \"manufacturer\":\"" + manufacturer + "\"}";
//   }
//   // Object클래스의 toString()메소드 오버라이드
//}
//
//public class Ch04Ex06 {
//   public static void main(String[] args) {
//      // TV 객체 생성
//      // int는 정수 타입이다.
//      // class는 참조 타입이다.
//      //int age;
//      TV lgTV = new TV();
//      TV samsungTV = new TV("SAMSUNG");
//      TV sonyTV = new TV(64, "SONY");
//      
//      System.out.println(lgTV.toString());
//      System.out.println(samsungTV);
//      System.out.println(sonyTV);
//   }
//   // 급할수록 돌아가라.
//   // 꾸준히...
//}