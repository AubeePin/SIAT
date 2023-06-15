package star_01;

import static java.lang.System.out;

public class Ch02 {

	public static void ex07(String[] args) {
		//     *
		//    ***
		//   *****
		//  *******
		// *********
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 4 - i; j++) {
				out.printf(" ");
			}
			for (int j = 0; j < (i + 1) * 2 - 1; j++) {
				out.printf("*");
			}
			System.out.println();
		}

	}

	public static void ex08(String[] args) {
		// *********
		//  *******
		//   *****
		//    ***
		//     *
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 1 + i; j++) {
				out.printf(" ");
			}
			for (int j = 0; j < (5 - i) * 2 - 1; j++) {
				out.printf("*");
			}
			System.out.println();
		}
	}

	public static void ex9(String[] args) {
		int end = 4;
		int eed = 1;
		
		for (int i = 0; i < 9; i++) {
			
			for (int j = 0; j < end; j++) {
				out.printf(" ");
			}
	
			for (int j = 0; j <eed*2-1; j++) {
				out.printf("#");
			}
	
			out.println();
			end = i < 4 ? end-1 : end+1;
			eed = i < 4 ? eed+1 : eed-1;
	}
}
	public static void main(String[] args) {
		int end = 4;
		int eed = 1;
		
		for (int i = 0; i < 9; i++) {
			
			for (int j = 0; j < end; j++) {
				out.printf(" ");
			}
	
			for (int j = 0; j <eed*2-1; j++) {
				out.printf(j<eed ? "&":"#");
			}
	
			out.println();
			end = i < 4 ? end-1 : end+1;
			eed = i < 4 ? eed+1 : eed-1;
	}
}
}

