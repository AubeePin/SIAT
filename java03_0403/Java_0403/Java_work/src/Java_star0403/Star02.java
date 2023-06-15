package Java_star0403;

import static java.lang.System.out;

import java.io.IOException;
import java.util.Scanner;

public class Star02 {

	public static void ex10(String[] args) {
		// *
		// ***
		// *****
		// *******
		// *********
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 4 - i; j++) {
				out.printf("^");
			}
			for (int j = 0; j <= i * 2; j++) {
				out.printf("*");
			}
			System.out.println();
		}
	}

	public static void ex11(String[] args) {
		Scanner scan = new Scanner(System.in);

		out.print("행의 수: ");
		int size = scan.nextInt();

		for (int i = 0; i < size; i++) {
			for (int j = 0; j <= i; j++) {
				out.print("*");
			}
			out.println();
		}
	}

	public static void ex12(String[] args) {
		// ********* 5 ~ <4
		// ****^**** 4 ~ <5
		// ***^^^*** 3 ~ <6
		// **^^^^^** 2 ~ <7
		// *^^^^^^^* 1 ~ <8
		// **^^^^^**
		// ***^^^***
		// ****^****
		// *********

		// 분석한다.
		// 작은 부분부터 단계적 접근
		// --- 침착하라(평상심) ---

		// 1. 9행9열로 별 출력.
		// 2. 각행의 공백이 시작하는 열과 공백이 끝나는 열을 찾는다.
		// 3. 패턴을 찾는다.
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				if (j > 0 && j < 8 && i != 0 && i != 8 && j != i) {
					out.print(" ");
				} else {
					out.print("*");
				}

			}
			System.out.println();
		}
	}

	// *********
	// *******
	// *****
	// ***
	// *

	// *********
	// * * * *
	// * * * *
	// ** **
	// * *
	// ** **
	// * * * *
	// * * * *
	// *********

// 행 수(홀수만): 5
//   *****
//   **  *
//   * * *
//   *  **
//   *****

// 동적으로 크기가 변하도록 구현.
// 행 수(홀수만): 9
//   *
//   **
//   ***
//   ****
//   *****
//   ******
//   *******
//   ********
//   *********

	public static void ex13(String[] args) {
		// 0 ********* 5 ~ <4
		// 1 ****^**** 4 ~ <5
		// 2 ***^^^*** 3 ~ <6
		// 3 **^^^^^** 2 ~ <7
		// 4 *^^^^^^^* 1 ~ <8
		// 5 **^^^^^** 2 ~ <7 9 - (i-3)
		// 6 ***^^^*** 3 ~ <6 9 - (3)
		// 7 ****^**** 4 ~ <5 9 - (4)
		// 8 ********* 5 ~ <4
		int cnt = 5;
		for (int i = 0; i < 9; i++) {
			int s = 0, e = 0;
			if (i < 4) {
				s = 5 - i;
				e = 4 + i;
			} else {
				s = i - 3;
				e = 9 - (i - 3);
			}
			for (int j = 0; j < 9; j++) {
				if (j >= s && j < e) {
					out.print(" ");
				} else {
					out.print("*");
				}
			}
			System.out.println();
		}
	}

	public static int getNum() {
		int num = 0;
		int ch = 0;

		try {
			while ((ch = System.in.read()) != '\n') {
				if (ch >= '0' && ch <= '9') {
					num = num * 10 + ch - '0';
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return num;
	}

	public static void ex14(String[] args) {
		// *
		// ***
		// *****
		// *******
		// *********
		// *******
		// *****
		// ***
		// *

		int cnt = 1;
		System.out.print("Input Size : ");
		int size = getNum();
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				// System.out.print(j<5-cnt || j>=4+cnt?"^":"*");
				System.out.print(j > size / 2 - cnt && j < size / 2 + cnt ? "*" : "^");
			}

			System.out.println();
			cnt = i < size / 2 ? cnt + 1 : cnt - 1;
		}
	}


	   public static void main(String[] args) {
	      //   *********
	      //   *  * *  *
	      //   * *   * *
	      //   **     **
	      //   *       *
	      //   **     **
	      //   * *   * *
	      //   *  * *  *
	      //   *********
	      System.out.print("Input Scale: ");
	      int scale = getNum();
	      boolean flag = true;
	      int size = 9;
	      int tmp = size;
	      for(int k=0; k<scale; k++) {
	         int cnt = 2;
	         int i=1;
	         if(flag) {
	            cnt = 1; i=0;
	            flag = false;
	         }
	         for(; i<size; i++) {
	            for(int l=0; l<scale; l++) {
	               int j = 0;
	               if(l>0) {
	                  j = 1;
	               }
	               
	               for(; j<size; j++) {
	                  boolean isStar = j==size/2+1-cnt || j==size/2-1+cnt;
	                  isStar = isStar || j==0 || j==size-1;
	                  isStar = isStar || i==0 || i==size-1;
	                  System.out.print(isStar?"*":" ");
	               }
	            }
	            System.out.println();
	            cnt = i<size/2 ? cnt+1 : cnt-1;
	         }
	      }
	   }
	}