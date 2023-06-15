package org.comstudy.lotto;


import java.util.Arrays;
import java.util.Random;

public class Ch04Homework02 {
   public static final int SIZE = 6;
   public static final int MAX = 6;
   public static final Random rand = new Random();

   public static void main(String[] args) {
      int[] lotto = new int[SIZE];
      
      for(int i=0; i<SIZE; ) {
         int number = 1 + rand.nextInt(MAX);
         // �ߺ� �ֳ� ���� ��
         // �ߺ� üũ�� ���� flag ����
         boolean flag = true;
         for(int j=0; j<i; j++) {
            // number�� lotto�迭�� j��° ��� ���� ��(if��)
            if(number == lotto[j]) {
               flag = false;
               break;
            }
         }
         
         if(flag) {
            // �ߺ� ���ٸ� �Է�
            lotto[i] = number;
            i++;
         }
      }
      
      Arrays.sort(lotto);
      System.out.println(Arrays.toString(lotto));
   }
}