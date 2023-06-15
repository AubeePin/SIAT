package star_01;

import static java.lang.System.out;

public class Ch03 {

	public static void main(String[] args) {
		int end = 4;

		for (int i = 0; i < 10; i++) {

			for (int j = 0; j < end; j++) {
				out.printf(j < end ? "*":"#");
			}

			out.println();
			end = i < 4 ? end - 1 : end + 1;
		}
	}
}