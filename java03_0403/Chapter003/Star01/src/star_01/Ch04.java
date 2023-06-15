package star_01;

import static java.lang.System.out;

import java.util.Scanner;


public class Ch04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		out.print("ÇàÀÇ ¼ö: ");
		int size = scan.nextInt();
	
		for(int i=0; i<3; i++) {
			for(int j=0; j<=i; j++){
				out.print("*");
			}
			out.println();
		}

	}

	}
