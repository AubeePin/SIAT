package Ch03.ex07;

import java.util.Scanner;

public class Ch03Ex07_02gugudan {
   Scanner scan = new Scanner(System.in);
   
   public Ch03Ex07_02gugudan() {
      ex01();
   }
   
   public void ex01() {
      int startDan=2, endDan=9; // ���۴�, �����
      System.out.print("���� �� �� �Է�: ");
      startDan = scan.nextInt();
      System.out.print("���� �� �� �Է�: ");
      endDan = scan.nextInt();
      
      //����1 : ������ 3�� 3���� ��� �ǵ��� �ϱ�
      //(��Ʈ : ���� ��� �Ǵ� �� ���� ����� ����)
      //����2 : ���۴�, ����� �Է� �ؼ� 3�� 3�� ����
      
      //startDan > endDan �� ��쿡�� ���� ��� �ǵ��� �϶�.
      //2��
      //��Ʈ swap�˰���
      
      if(startDan > endDan) {
    	  int tmp = startDan;
    	  startDan = endDan;
    	  endDan =tmp;
      }
      
      for(int cnt=1; cnt<=9; cnt++) {
         for(int dan=startDan; dan<=endDan; dan++) {
            System.out.format("%d*%d=%d\t", dan, cnt, dan*cnt);
         }
         System.out.println();
      }
   }

   public static void main(String[] args) {
      new Ch03Ex07_02gugudan();
   }

}