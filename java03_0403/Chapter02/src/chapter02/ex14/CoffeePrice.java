package chapter02.ex14;

import java.util.Scanner;
public class CoffeePrice {
   public static final int ����������=1, īǪġ��=2, ī���=3, �Ƹ޸�ī��=4;
   public static final String[] items= {"","����������","īǪġ��","ī���","�Ƹ޸�ī��"};
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      
      System.out.println("���� Ŀ�� �帱���? ");
      for(int i=1; i<items.length; i++) {
         System.out.print(i + "."+items[i]+" ");
      }
      System.out.print("\n����: ");
      int order = scanner.nextInt();
      int price=0;
      switch (order) {
         case ����������:
         case īǪġ��:
         case ī���:
            price = 3500;
            break;
         case �Ƹ޸�ī�� :
            price = 2000;
            break;
         default:
            System.out.println("�޴��� �����ϴ�!");
      }
      if(price != 0)
         System.out.print(items[order] + "�� " + price + "���Դϴ�");
      scanner.close();
   }
}