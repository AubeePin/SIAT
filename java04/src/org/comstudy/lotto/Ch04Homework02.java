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
         // 중복 있나 없나 비교
         // 중복 체크를 위한 flag 변수
         boolean flag = true;
         for(int j=0; j<i; j++) {
            // number와 lotto배열의 j번째 요소 값과 비교(if문)
            if(number == lotto[j]) {
               flag = false;
               break;
            }
         }
         
         if(flag) {
            // 중복 없다면 입력
            lotto[i] = number;
            i++;
         }
      }
      
      Arrays.sort(lotto);
      System.out.println(Arrays.toString(lotto));
   }
}