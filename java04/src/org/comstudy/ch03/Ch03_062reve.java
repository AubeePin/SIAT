package org.comstudy.ch03;

import java.util.Arrays;

public class Ch03_062reve {
   
   public static void reverse(int[] arr2) {
      // ������ ��� ����
      for (int i = 0; i < arr2.length/2; i++) {// /2�� �� �ִ��� ����� length�� ���� �˻��غ���.
         // i ��° ��Ұ��� (arr2.length-1)-i ġȯ�ϱ�
         int tmp = arr2[i];
         arr2[i] = arr2[ -i];
         arr2[(arr2.length-1)-i] = tmp; //���ҿ� ���ؼ� �����
      }
   }
   
   public static void main(String[] args) {
      int[] arr = new int[] {1,2,3,4,5};
      
      reverse(arr);
      System.out.println(Arrays.toString(arr));
   }

   public static void ex062() {
      int[] arr = new int[] {1,2,3,4,5};
      
      System.out.println(Arrays.toString(arr));
      
      int[] arr2 = arr;
      arr2[0] *= 100;
      arr2[1] *= 100;
      arr2[2] *= 100;
      arr2[3] *= 100;
      arr2[4] *= 100;
      
      System.out.println("arr => " + Arrays.toString(arr));
      System.out.println("arr2 => " + Arrays.toString(arr2));
   }

}