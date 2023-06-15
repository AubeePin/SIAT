package Ch03Ex;

import static org.comstudy21.io.MyUtils.*;

public class Ch03Ex05StarWars {
   
   
   public static void printfTest(String[] args) {
      // �ѹ��� �Ѱ��� ���
      printf("Hello %s\n", "�浿��");
   }
   
   public static void ex01(String[] args) {
      for(int i=0; i<25; i++) {
         printf("*");
         if(i!=0 && (i+1)%5==0) {
            printf("\n");
         }
      }
   }
   
   public static void ex02(String[] args) {
      // 0 : *
      // 1 : **
      // 2 : ***
      // 3 : ****
      // 4 : *****
      for(int i=0; i<5; i++) {
         for(int j=0; j<i+1; j++) {
            printf("*");
         }
         printf("\n");
      }
   }

   public static final int MAX = 5;

   public static void ex03(String[] args) {
      // 0 : *****
      // 1 : ****
      // 2 : ***
      // 3 : **
      // 4 : *
      
      for(int row=0; row<MAX; row++) {
         for(int col=0; col<MAX-row; col++) {
            printf("*");
         }
         printf("\n");
      }
   }
   
   
   public static void ex04(String[] args) {
      // 0 :     *
      // 1 :    **
      // 2 :   ***
      // 3 :  ****
      // 4 : *****
      
      for(int i=0; i<5; i++) {
         for(int j=0; j<4-i; j++) {
            printf(" ");
         }   
         for(int j=0; j<i+1; j++) {
            printf("*");
         }
         printf("\n");
      }
      
      for(int i=0; i<5; i++) {
         for(int j=0; j<5; j++) {
            printf(j<4-i?" ":"*");
         }         
         printf("\n");
      }
      
      // ����
      // 0 : *****
      // 1 :  ****
      // 2 :   ***
      // 3 :    **
      // 4 :     *
      
   }
   
   public static void main(String[] args) {
      // *
      // **
      // ***
      // ****
      // *****
      // ****
      // ***
      // **
      // *
      
      int end = 1;
      for(int i=0; i<9; i++) {
         for(int j=0; j<end; j++) {
            printf("*");
         }
         printf("\n");
         end = i<4 ? end+1 : end-1;
      }
      
      // ����
      //     *
      //    **
      //   ***
      //  ****
      // *****
      //  ****
      //   ***
      //    **
      //     *
   }
}