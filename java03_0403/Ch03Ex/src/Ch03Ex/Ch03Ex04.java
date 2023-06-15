package Ch03Ex;

public class Ch03Ex04 {

	//public static void homework_02(String[] args) {
		// 1 - 3 - 5 - 7 - 9 = 5
	
	public static void main(String[] args) {
		// 1~ 10까지의 숫자중 홀수만 출력하고 그 누적 값을 계산 프로그램.
		// 1 +3 + 5 + 7 + 9 = 25
		int total = 0;
		int i = 1;// 초기값 - 반복문을 시작하는 값
		// for(;;)
		while (i <= 9) { // i가 9보다 작거나 같을 경우 반복한다.

			System.out.print(i);
			// 누적
			total = total + i;
			if (i < 9) {
				System.out.print('+');
			}

			i += 2; // i = i + 2;
		}
		System.out.print("=" + total);
		// 시작이 있고 끝이 있어야 한다.
		// 시작 하고 끝나지 않은 프로그램은 오류다.
	}
}
