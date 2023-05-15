package ch02;

import java.util.Scanner;

public class pj08 {
	public static boolean inRect(int x, int y, int rectx1, int recty1, int rectx2, int recty2) {
		if((x >= rectx1 && x <= rectx2)&& (y>= recty1 && y<= recty2))
			return true;
		else return false;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("x1와 x2를 입력해주세요>> ");
		int x1 = scan.nextInt();
		int y1 = scan.nextInt();
		System.out.println("y1와 y2를 입력해주세요>> ");
		int x2 = scan.nextInt();
		int y2 = scan.nextInt();
		
		if()

	}

}
