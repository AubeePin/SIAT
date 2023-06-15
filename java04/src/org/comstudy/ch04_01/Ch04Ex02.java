package org.comstudy.ch04_01;

import java.util.Scanner;
import static java.lang.System.*;

import java.io.PrintStream;

public class Ch04Ex02 {
   static Scanner scan = new Scanner(System.in);
   static int[] days = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
   static int month, day, nextMon, nextDay;
   static int total;
   static int max = 100;
   
   public static final void print(String str) {
      out.print(str);
   }
   
   public static PrintStream printf(String format, Object ... args) {
        return java.lang.System.out.format(format, args);
    }

   public static void main(String[] args) {
      print("��/�� �Է�: ");
      month = scan.nextInt();
      day = scan.nextInt();
      
      System.out.printf("%d�� %d���� 100�� �Ĵ� ", month, day);
      
      // total�� max(100)�̻� �ɶ����� ���� ��¥ ���� �����Ѵ�.
      // 1. total�� ������ ���� ���� ��¥�� �ʱ�ȭ
      // 2. total�� 100�����̸� ���� ���� ���� �� ���� ��� total�� ���� ��¥ ���� 
      // 3. total 100�̻��̸� ���������� ��¥ ������ ��ġ�� ��ŭ ����
      // nextDay = days[nextMon-1] - (total - max)
      
      total = days[month-1] - day;
      nextMon = month;
      while(total < max) {
         nextMon %= 12;
         total += days[nextMon];
         nextMon++;
      }
      nextDay = days[nextMon-1] - (total - max);
      
      System.out.printf("%d�� %d���Դϴ�.\n", nextMon, nextDay);
   }

}