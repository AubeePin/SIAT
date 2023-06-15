package org.comstudy.ch04_01;

import java.util.Scanner;
import static java.lang.System.out;

public class Ch04Ex01 {
   public static final Scanner scan = new Scanner(System.in);
   
   public static void main(String[] args) {
      int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};
      int total = 0;
      int month = 0;
      int day = 0;
      
      // days�� ��� ��� ���� total�� ���� �� ����
      for(int i=0; i<days.length; i++) {
         total += days[i];
      }
      
      // 1���� 365���Դϴ�.
      out.printf("1���� %d���Դϴ�.\n", total);
      
      out.print("�� �Է�: ");
      month = scan.nextInt();
      out.print("�� �Է�: ");
      day = scan.nextInt();
      
      // 2���� 28�ϱ��� �ֽ��ϴ�. 
      // days[1] == 28
      out.printf("%d���� %d�ϱ��� �ִ�.\n", month, days[month-1]);
      
      // 1�� 1�Ϻ��� 4��10�ϱ����� 100���Դϴ�.
      // total = (1�� + 2�� + 3��) + 10��
      total = 0;
      for(int i=0; i<month-1; i++) {
         total += days[i];
      }
      total += day;
      out.printf("1��1�Ϻ��� %d��%d�ϱ����� %d���Դϴ�.\n", month, day, total);
      
      //4�� 10�� ���� 12�� 31�� ������ 265�� ���ҽ��ϴ�.
      //4�� ��¥�� - day + ( 5�� + 6�� + 7�� + 8�� + 9�� + 10�� +
      total = days[month-1] - day;
      for(int i = month; i<12; i++) {
    	  total += days[i];
      }
      out.printf("%d��%d�Ϻ��� 12�� 31�ϱ����� %d�� ���ѽ��ϴ�..\n", month, day, total);
      
      //����:
      //4�� 10���� 100�� �Ĵ� ?�� ?�� �Դϴ�.
      //�� 12�� �̻��̸� �ٽ� 1������ ���ư��� �Ѵ�.
      //CalendarŬ������ DateŬ���� ������� ����.
      //���� ����.
      //������ �ݺ����� �迭�� ����ؼ� �����Ѵ�.
    		 
   }

}