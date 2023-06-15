package star_01;
import static java.lang.System.out;
import static org.comstudy21.io.MyUtils.*;

public class Ch01 {

	public static void ex06(String[] args) {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < i; j++) {
				printf(" ");
			}
			for (int j = 0; j < 5 - i; j++) {
				printf("*");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int end = 4;
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 5; j++) {
				out.printf(j < end ? "^" : "*");
			}
			out.println();
			end = i < 4 ? end - 1 : end + 1;
		}
	}

}
