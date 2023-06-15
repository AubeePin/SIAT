package chapter02.ex14;

import java.io.PrintStream;
import java.util.Scanner;

public class Ch02Ex14Test {

	   public static PrintStream printf(String format, Object ... args) {
	        PrintStream out;
			return out.format(format, args);
 }

	
	   public static void main(String[] args) {
		      // ���� �Է� �޾Ƽ� �ش� ���� ���ϱ������� ����Ѵ�.
		      // switch~case�� ����
		      // ��)
		      // ���Է� : 2
		      // 2���� 28�ϱ����Դϴ�.
		      int month = 0;
		      int day = 31;
		      
		      System.out.print("�� �Է�: ");
		      Scanner scan;
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
}
	   