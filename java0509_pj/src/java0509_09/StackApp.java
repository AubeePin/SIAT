package java0509_09;

import java.util.Scanner;

public class StackApp implements Stack {
   public static final Scanner scan = new Scanner(System.in);
   
   String[] arr;
   int top = 0;
   int capacity;
   
   public StackApp(int capacity) {
      this.capacity = capacity;
      arr = new String[capacity];
   }

   @Override
   public int length() {
      // ���� ���� �� ����� ����
      return top;
   }

   @Override
   public int capacity() {
      // �迭�� ��ü ũ��
      return arr.length;
   }

   @Override
   public String pop() {
      if(top <= 0) {
         //System.out.println("������ ������ϴ�.");
         return null;
      }
      return arr[--top];
   }

   @Override
   public boolean push(String val) {
      if(top>=capacity) {
         System.out.println("������ �� á���ϴ�. Ǫ�� �Ұ���!");
         return false;
      }
      arr[top++] = val;
      return true;
   }

   public static void main(String[] args) {
      System.out.print("�� ���� ���� ������ ũ�� �Է� >> ");
      int size = scan.nextInt();
      StackApp stackApp = new StackApp(size);
      for(;;) {
         System.out.print("���ڿ� �Է� >> ");
         String val = scan.next();
         if("�׸�".equals(val)) {
            break;
         }
         stackApp.push(val);
      }
      
      System.out.print("���ÿ� �ִ� ��� ���ڿ� �� : ");
      String word = "";
      while((word = stackApp.pop())!=null) {
         System.out.print(word + " ");
      }
   }
}