package chapter02.ex02_2;

import java.util.Scanner;

public class Ch02Ex13Test {

   public static void main(String[] args) {
   
      Scanner scan = new Scanner(System.in);
      int a, b, c;
      // ���������� �ʱⰪ �ʼ�, ����ʵ�� �ڵ� �ʱⰪ ����.
      int max=0, mid=0, min=0;
      
      System.out.print("���� 3�� �Է�: ");
      a = Util.getNum();
      b = Util.getNum();
      c = Util.getNum();
      // ��ȿ�� �˻�
      while(!(a != b && a != c && b != c)) {
         System.out.println("���� �ٸ� ������ �Է� �ϼ���!");
         System.out.print("���� 3�� �ٽ� �Է�: ");
         a = Util.getNum();
         b = Util.getNum();
         c = Util.getNum();
      }
      
      // ��
      // �ϴ� max, min�� �����Ѵ�.
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
      
      // ��� (���乮�ڸ� �̿��� ���)
      System.out.printf("max=%d, mid=%d, min=%d\n", max, mid, min);
   }
} // end of class

   
  
      