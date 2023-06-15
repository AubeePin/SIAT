package star_01;

import static java.lang.System.out;

public class Ch05 {

	public static void ex11(String[] args) {

		// 분석한다.
		// 작은부분부터 단계쩍 접근
		// 침착하라(평상심)
		//

		// 1. 9행 9열로 별 출력
		// 2. 각행의 공백이 시작하는 열과 공백이 끝나는 열을 찾는다.
		// 3. 패턴을 확인한다.
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				if (j > 1 && j < 8 && i != 0 && i != 8 && j == i) {
					out.print("^");
				} else {
					out.print("*");
				}
			}
			out.println();
		}

	}

	public static void main(String[] args) {
		// 0********* 5 ~<4
		// 1****^**** 4 ~<5
		// 2***^^^*** 3 ~<6
		// 3**^^^^^** 2 ~<7
		// 4*^^^^^^^* 1 ~<8
		// 5**^^^^^** 2 ~<7 9 -(i-3
		// 6***^^^*** 3 ~<6 9 - (6)
		// 7****^**** 4 ~<5
		// 8********* 5 ~<4

		
			for (int i = 0; i < 9; i++) {
				int s = 0, e = 0;
				if (i < 4) {
					s = 5 - i;
					e = 4 + i;
				} else {
					s = i - 3;
					;
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
	}

