package ch02;

import java.util.Scanner;

public class pj07 {

	   public static void main(String[] args) {
	      Scanner scan = new Scanner(System.in);
	      System.out.println("점(x,y)의 좌표를 입력하시오>>>");
	      
	      int x = scan.nextInt();
	      int y = scan.nextInt();
	      
	      if(x>=100 && x<=200 && y>=100 && y<=200) {
	         System.out.println("(" + x + ","+ y + ")"+"는 사각형 안에 있습니다.");
	      }else {
	         System.out.println("사각형 안에 있지 않습니다.");
	      }
	   }

	}