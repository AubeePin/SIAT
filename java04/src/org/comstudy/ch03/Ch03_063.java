package org.comstudy.ch03;

import java.util.Arrays;

public class Ch03_063 {
		
	public static int[] concatArrr(int[] a1, int[] a2){
		int[] result = new int[a1.length + a2.length];//�迭�� ���̸� �̿��ؼ� ���ο� �迭�� ����ִ� �迭�� ����°�. ������ �迭�� ����!
		// �迭�� �ڹٰ�ü�� ������ �ؾ���.  ��ü �����ϴ� �������� ����! �ڹٿ��� ��ü �����Ҷ� new�� �� ����մϴ�.
		//{10,20,30,40,50,60,70} �ǵ��� �����Ѵ�. /
		for(int i = 0; i < result.length; i++) {
			if(i<3) {
				result[i] = a1[i];
			}else {
				result[i] = a2[i-3];
			}
			
		}
		
		return result;
	}

	public static void main(String[] args) {
		int[] a1 = {10,20,30};
		int[] a2 = {40,50,60,70};
		
		int[] a3 = concatArrr(a1,a2);//{10,20,30,40,50,60,70}
		int[] a4 = sumArr(a1,a2);
		System.out.println(Arrays.toString(a3));
		System.out.println(Arrays.toString(a4));
	}

	private static int[] sumArr(int[] a1, int[] a2) {
		int[] close = new int[a2.length];
		
		for (int i = 0; i < close.length; i++) {
			if(i<3) {
				close[i]=a1[i]+a2[i];
				
			}else {
				close[i]= a2[i];
			}
			
		}
		
		return close;
		
	}
		
}
