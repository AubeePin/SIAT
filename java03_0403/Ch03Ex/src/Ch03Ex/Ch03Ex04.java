package Ch03Ex;

public class Ch03Ex04 {

	//public static void homework_02(String[] args) {
		// 1 - 3 - 5 - 7 - 9 = 5
	
	public static void main(String[] args) {
		// 1~ 10������ ������ Ȧ���� ����ϰ� �� ���� ���� ��� ���α׷�.
		// 1 +3 + 5 + 7 + 9 = 25
		int total = 0;
		int i = 1;// �ʱⰪ - �ݺ����� �����ϴ� ��
		// for(;;)
		while (i <= 9) { // i�� 9���� �۰ų� ���� ��� �ݺ��Ѵ�.

			System.out.print(i);
			// ����
			total = total + i;
			if (i < 9) {
				System.out.print('+');
			}

			i += 2; // i = i + 2;
		}
		System.out.print("=" + total);
		// ������ �ְ� ���� �־�� �Ѵ�.
		// ���� �ϰ� ������ ���� ���α׷��� ������.
	}
}
