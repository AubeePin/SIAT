package Ch03.ex08;

public class Ch03Ex08 {

	public static void main(String[] args) {
		// �ڹ� �迭
		int[] arr = new int[7];// �迭Ÿ�� �ű⿡ ��ƮŸ��
		System.out.println("arr.length=>"+arr.length);// 7

		arr[0] = 10;
		arr[1] = 7;
		arr[2] = 5;
		arr[3] = 100;
		arr[4] = 30;
		arr[5] = 25;
		arr[6] = 55; // �迭�� ������ ��� ÷��(index) == �迭.length - 1

		// ������ ÷�ڷ� ��� ����
		// �迭�� ����� ���� ū�� ã��
		// System.out.println(Integer.MIN_VALUE );
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {
			// System.out.println(arr[i]);
			// �迭�� �ݺ� �ϸ鼭 ���� ū ���� max�� ġȯ.
		
		if (max < arr[i]) {
			max = arr[i];
		}
		//�迭�� ����� ���� ���� ��Ҹ� min�� ����.
		if(min >arr[i]) {
			min = arr[i];
		}
	}
			System.out.println("Max =>" + max);
			System.out.println("Min =>" + min);
		}
	}
