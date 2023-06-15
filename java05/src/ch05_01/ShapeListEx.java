package ch05_01;

import java.util.Scanner;

class ShapeList {
   Shape start, last, obj, p;
   
   public void add(Shape node) {
      if(start == null) {
         start = node;
         last = start;
         System.out.println("���� ��� ����");
         return;
      }
      last.next = node;
      last = last.next;
      System.out.println("�� ��� �߰�");
   }
   
   public void show() {
      if(start == null) {
         System.out.println("��尡 ������ϴ�.");
         return;
      }
      p = start;
      while(p != null) {
         p.draw();
         p = p.next;
      }
   }
   
   public void delete(int idx) {
      // ���� ����Ʈ�� idx��°�� ��Ҹ� �����Ѵ�.
      p = start;
      int cnt = 0;
      while(p != null) {
         p.draw();
         p = p.next;
         cnt++;
      }
   }
}

public class ShapeListEx {
   public static final Scanner scan = new Scanner(System.in);
   public static void main(String[] args) {
      ShapeList sList = new ShapeList();
//      sList.add(new Line());
//      sList.add(new Rect());
//      sList.add(new Circle());
//      sList.add(new Shape());
//      sList.add(new Rect());
//      
//      sList.show();
      
      while(true) {
         System.out.print("1.Line 2.Rect 3.Circle 4.Shape 5.���� 6.���� 6.���� >>");
         switch(scan.nextInt()) {
         case 1 : sList.add(new Line()); break;
         case 2 : sList.add(new Rect()); break;
         case 3 : sList.add(new Circle()); break;
         case 4 : sList.add(new Shape()); break;
         case 5 : sList.show(); break;
         case 6 : 
            System.out.print("���� �� ��ȣ >>");
            int no = scan.nextInt();
            sList.delete(no);
         case 7 : System.exit(0); break;
         default : System.out.println("�ش� ���� �����ϴ�!");
         }
      }
   }

}