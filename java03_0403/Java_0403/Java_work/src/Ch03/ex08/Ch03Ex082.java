package Ch03.ex08;

import java.util.Arrays;
import java.util.Scanner;

public class Ch03Ex082 {
	
	static Scanner scan = new Scanner(System.in);
	

	public static void main(String[] args) {
		System.out.print("�迭�� ũ��:");
		int size =scan.nextInt();
		int[] arr = new int[size];
		System.out.println("arr.length =>" + arr.length);
		//�迭�� ũ�⸸ŭ �ݺ��ؼ� ���� �Է� �� �迭�� ����
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			System.out.print(i+1+"��° ��� �Է�: ");
			arr[i]= scan.nextInt();
			sum += arr[i];
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("sum =>" + sum);
	}

}
