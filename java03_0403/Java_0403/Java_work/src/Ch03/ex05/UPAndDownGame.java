package Ch03.ex05;

import java.util.Random;
import java.util.Scanner;

public class UPAndDownGame {
	   Random r = new Random();
	   Scanner scan = new Scanner(System.in);
	   int k;
	   int num = -1; // ����� �Է�
	   int max, min;
	   
	   // ������(constructor) �̸��� Ŭ������� �����ϴ�.
	   // �����ڴ� �������� ����.
	   // Ctrl + spacebar ����Ű
	   public UPAndDownGame() {
	      // ������, ���, ������, ĸ��ȭ ...
	      while(true) {
	         game();
	         System.out.println("�� �õ� �Ͻðڽ��ϱ�?");
	         char yn = scan.next().charAt(0);
	         while(!(yn=='y' || yn=='n')) {
	            System.out.println("'y'�Ǵ� 'n'�� �Է� �ϼ���!");
	            System.out.print("�ٽ� �Է� >>");
	            yn = scan.next().charAt(0);
	         }
	         if(yn == 'n') {
	            System.out.println("���� ��ȸ�� ...");
	            break;
	         }
	      }
	      System.out.println("���� ����!!");
	   }
	   
	   public void game() {
	      System.out.println("::::: Up & Down ���� :::::");
	      min = 0; 
	      max = 99;
	      k = Math.abs(r.nextInt(max+1) );
	      System.out.printf("���� �����Ͽ����ϴ�. ���߾� ������.(�̽�Ʈ����: %d)\n", k);
	      int cnt=0;
	      int size = 5;
	      while(cnt<size ) {
	         System.out.printf("Hint: %d~%d������ ���� �Է� �Ͻÿ�\n", min, max);
	         System.out.printf("%d��° �õ�. ��ȸ�� %dȸ ����>> ", cnt+1, size-cnt);
	         num = scan.nextInt();
	         // ��ȿ�� �˻�
	         while(!(num>=min && num<=max) ) {
	            System.out.println("������ �ʰ��߽��ϴ�.");
	            System.out.printf("Hint: %d~%d������ ���� �Է� �Ͻÿ�\n", min, max);
	            System.out.printf("%d��° �õ�. ��ȸ�� %dȸ ����>> ", cnt+1, size-cnt);
	            num = scan.nextInt();
	         }
	         if(num > k) {
	            System.out.println("�� ����");
	            max = num - 1;
	         } else if(num < k) {
	            System.out.println("�� ����");
	            min = num + 1;
	         } else {
	            break;
	         }
	         cnt++;
	      }
	      if(cnt<5) {
	         System.out.println("����");
	      } else {
	         System.out.println("��ȸ�� ��� ���� �߽��ϴ�. �ǰ�!");
	      }
	   }

	   public static void main(String[] args) {
	      new UPAndDownGame(); // ��ü ����, ������ ȣ��
	   }
	}