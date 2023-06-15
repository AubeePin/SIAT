package chapter02.ex02_2;

import java.io.IOException;
import java.util.Scanner;

public class Ch02Ex12 {
   // ���� ��Ű���� ���� Ŭ���������� ���Ǵ� �ʵ�� ���������� ��������.
   static Scanner scan = new Scanner(System.in);
   
   public static int getNum() throws IOException {
      int num = 0;
      // '0'�� 48 ~
      // '0' ~ '9' ���̸� ó��
      int ch = 0;
      while((ch = System.in.read()) != '\n') { // Enter�� �ƴ϶�� �ݺ��Ѵ�.
         // '0' == 48
         // ���� ch�� '1'�̶�� 49. ���� 1�� �ٲ���� 49-'0'
         // Ű�� �Է� ���� �ƽ�Ű���� ���ڷ� ��ȯ.
         if(ch>='0' && ch<='9') {
            // ch�� ���� '0' ~ '9'���̸� ó�� ��.
            //(num�� 10�� �ڸ��� �ٲ۴�)
            // 90 + 7
            // 970 + 8
            // ���� �Էµ� ���� �ڸ��� ���� + ���� �Է� �� ����
            num = (num*10) + (ch-'0');
         }
      }
      // Enter�� �Է� �Ǿ �ݺ��� ������.
      return num;
   }
   
   public static void main(String[] args) throws IOException {
      // ������ �Է� �޾Ƽ� ������ ����ϴ� ���α׷�
      int score = 0;
      String grade = "F";
      
      System.out.print("�����Է�: ");
      score = getNum();
      System.out.print(score+"���� ");
      
      // ���� ������ �̿��� ��ȿ�� �˻�
      // ������ in ������ out - ������ ���� �����Ⱑ ���´�.
      // �����̴�.
      while (score<0 || score>100) {
         System.out.println("����! ���� �ʰ� �߽��ϴ�. �ٽ� �Է�!");
         System.out.print("�����Է�: ");
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
      
      // +�Ǵ� -���̱�
      // 1���ڸ��� �����ؼ� ���Ѵ�. %������ Ȱ�� (������ ����)
      int num = score % 10;
      if(score >= 60) {
         if(score == 100 || num >= 7) {
            grade += "+";
         } else if(num <= 3) {
            grade += "-";
         }
      }
      System.out.println(grade + "�Դϴ�.");
      
      System.out.println("�� �õ� �ϰڽ��ϱ�?");
      System.out.print("Y�Ǵ� N�Է� : ");
      String yn = scan.next();
      // ��ȿ�� �˻� �߰�
      while(!( "Y".equals(yn.toUpperCase()) || "N".equals(yn.toUpperCase()) )) {
         System.out.println("�Է� ����! Y�Ǵ� N�� �Է��ϼ���!");
         System.out.print("Y�Ǵ� N�Է� : ");
         yn = scan.next();
      }
      // �ڹٿ����� ���ڿ� �񱳴� equals()�� �Ѵ�.
      // String�� Ŭ�����̴�. �׷��Ƿ� ���ڿ��� ��ü�̴�.
      //if(yn.equals("Y"))
      // null pointer ���� �߻��� �پ���.
      if("Y".equals(yn.toUpperCase())) {
         // �ƴ¸�ŭ ���δ�.
         // �������� - �칰�� ������... ������ ����ؾ� �Ѵ�!
         System.out.println("����� �ϰڽ��ϴ�.");
         main(args); // main�� �Լ��̱� ������ �׳� ȣ�� �Ѵ�. (���ȣ��)
      } else {
         System.out.println("���α׷� ����!");
         System.out.println("�����ϼ̽��ϴ�!");
      }
   }

}