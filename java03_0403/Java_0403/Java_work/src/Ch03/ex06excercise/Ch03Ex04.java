package Ch03.ex06excercise;

import java.util.Scanner;

public class Ch03Ex04 {
   static Scanner scan = new Scanner(System.in);
   public static void main(String[] args) {
      System.out.print("�ҹ��� ���ĺ� �ϳ��� �Է��Ͻÿ�>>");
      char ch = scan.next().toLowerCase().charAt(0);
      
      for(char j=ch; j>='a'; j--) {
         for(char i='a'; i<=j; i++) {
            System.out.print((char)i);
         }
         System.out.println();
      }
   }

}