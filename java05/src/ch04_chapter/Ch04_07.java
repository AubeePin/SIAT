//package ch04_chapter;
//
//import java.util.Scanner;
//
//class Day {
//   private String work;
//   public void set(String work) {
//      this.work = work;
//   }
//   public String get() {
//      return work;
//   }
//   public void show() { // �����ִ°�
//      if(work == null) {
//         System.out.println("�����ϴ�.");
//      } else {
//         System.out.println(work + "�Դϴ�.");
//      }
//   }
//}
//
//class MonthSchedule {
//   Scanner scan = new Scanner(System.in);
//   Day[] days;
//   int size;
//   public MonthSchedule(int size) {
//      this.size = size;
//      this.days = new Day[size];
////      for(int i=0; i<size; i++) {
////         this.days[i] = new Day();
////      }
//   }
//   
//   public void input() {
//      System.out.println("---- input ----");
//      System.out.printf("��¥(1~%d)?", size);
//      int day = scan.nextInt();
//      System.out.print("����(��ĭ�����Է�)?");
//      if (days[day-1] == null) {         
//         days[day-1] = new Day();
//      }
//      days[day-1].set(scan.next());
//   }
//   
//   public void view() {
//      System.out.println("---- view ----");
//      System.out.printf("��¥(1~%d)?", size);
//      int day = scan.nextInt();
//      System.out.print(day+"���� �� ���� ");
//      if(days[day-1] != null) {
//         days[day-1].show();
//      } else {
//         System.out.println("�����ϴ�.");
//      }
//   }
//   
//   public void finish() {
//      System.out.println("---- finish ----");
//      System.exit(0);
//   }
//   
//   public void run() {
//      System.out.println(":::::: �̹��� ������ ���� ���α׷� ::::::");
//      while(true) {
//         System.out.print("1.�Է� 2.���� 3.���� >>");
//         switch(scan.nextInt()) {
//         case 1 : input(); break;
//         case 2 : view(); break;
//         case 3 : finish(); break;
//         default: System.out.println("�ش� ���� �����ϴ�.");
//         }
//         System.out.println();
//      }
//   }
//}
//
//public class Ch04_07 {
//   public static void main(String[] args) {
//      new MonthSchedule(30).run();
//   }
//}