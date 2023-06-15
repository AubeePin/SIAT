package chapter02.ex14;

import java.util.Scanner;
public class CoffeePrice {
   public static final int 에스프레소=1, 카푸치노=2, 카페라떼=3, 아메리카노=4;
   public static final String[] items= {"","에스프레소","카푸치노","카페라떼","아메리카노"};
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      
      System.out.println("무슨 커피 드릴까요? ");
      for(int i=1; i<items.length; i++) {
         System.out.print(i + "."+items[i]+" ");
      }
      System.out.print("\n선택: ");
      int order = scanner.nextInt();
      int price=0;
      switch (order) {
         case 에스프레소:
         case 카푸치노:
         case 카페라떼:
            price = 3500;
            break;
         case 아메리카노 :
            price = 2000;
            break;
         default:
            System.out.println("메뉴에 없습니다!");
      }
      if(price != 0)
         System.out.print(items[order] + "는 " + price + "원입니다");
      scanner.close();
   }
}