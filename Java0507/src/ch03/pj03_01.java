package ch03;
import java.util.Scanner;

public class pj03_01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수를 입력하세요!>>> ");
		
		int num = scanner.nextInt();
		
		for(int i = 0; i<num; i++) {
			for(int j = 0; j<num-i; j++) {
				System.out.print(" ");
			}
			for(int io = 0; io<i*2+1; io++) {
				System.out.print("*");
				
			}System.out.println();
			
		}
		
		scanner.close();
	}		
}
