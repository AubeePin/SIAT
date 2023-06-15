package chapter02.ex02_2;

import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

import com.sun.tools.jdeprscan.scan.Scan;

import static java.lang.System.out;

public class Ch02Ex14 {
   public static void puts(String str) {
      System.out.print(str);
   }
   
   private static int getNum() {
      int num = 0;
      int ch=0;
      boolean flag = false;
      try {
         while((ch=System.in.read())!='\n') {
            if(ch>='0' && ch<='9') {
               num = num*10; // �տ� �Է� ���� �ڸ��� �ø���
               num += ch - '0'; // ���� �Էµ� ���� ���ϱ�
               flag = true;
            }
         }
      } catch (IOException e) {}
      
      if(!flag) {
         System.out.println("���: �������� �����Դϴ�!");
         System.out.println("������ �Է��ϰ� Enter ġ����!");
         System.out.print("�ٽ� �Է�: ");
         num = getNum(); // ���ȣ��
      }
      return num;
   }
   
   public static PrintStream printf(String format, Object ... args) {
        return out.format(format, args);
    }
   
   static Scanner scan = new Scanner(System.in);
   
   public static void main(String[] args) {
      // ���� �Է� �޾Ƽ� �ش� ���� ���ϱ������� ����Ѵ�.
      // switch~case�� ����
      // ��)
      // ���Է� : 2
      // 2���� 28�ϱ����Դϴ�.
      int month = 0;
      int day = 31;
      
      System.out.print("�� �Է�: ");
      month = scan.nextInt();
      while(month<1 || month>12) {
         System.out.println("�߸� �Է� �߽��ϴ�. ���� ������ 1~12���� �Դϴ�.");
         System.out.print("�ٽ� �Է�: ");
         month = scan.nextInt();
      }
      
      switch(month) { //�� ���� �ƴ� ���� or ���ڿ� ���� �Է��Ѵ�. 
      case 2 : day = 28; break;
      case 4 : case 6 : case 9 : case 11 : day = 30; break;
      default : System.out.println("�ش���� �����ϴ�!");
      }
      
      // printf�� print format
      // C����� ����Լ� printf()�� ������ ���� ��.
      System.out.printf("%d���� %d�ϱ��� �ִ�\n", month, day);
   }

   public static void test01(String[] args) {
      puts("---- MENU ----\n");
      puts("1.INPUT 2.OUTPUT 3.SEARCH 4.FINISH\n");
      puts("Choice: ");
      int no = getNum();
      
      switch(no) { //�� ���� �ƴ� ���� or ���ڿ� ���� �Է��Ѵ�. 
      case 1 : puts("#### �Է� ��� ####\n"); break;
      case 2 : puts("#### ��� ��� ####\n"); break;
      case 3 : puts("#### �˻� ��� ####\n"); break;
      case 4 : puts("#### ���� ####\n"); break;
      default : puts("#### �ش� ���� ����! ####\n");
      }
   }

}