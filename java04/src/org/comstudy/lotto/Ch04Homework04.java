package org.comstudy.lotto;

import java.util.Arrays;
import java.util.Random;


public class Ch04Homework04 {
	public static final Random rand = new Random();
	public static final int MAX = 45;
	public static final int SIZE = 6;
	public static final int[] lotto = new int[SIZE];
	public static final int[] ball = new int[MAX];
	static {
		//static �ʱ�ȭ ��(�����ں��� ���� ���� �Ǵ� �κ�
		for(int num = 1; num<=MAX; num++) {
			ball[num-1] = num;//0���� 45���� �����µ� �̰� �ѱ������� �����ϸ� 1���� 46�Դϴ� �׷��� -1
		}
	}

	public static void main(String[] args) {
//		int[] ball = int [MAX];
//		ball�� ������ ��ġ���� num�� �̾ƿ´�.
//		6�� �ݺ�
//		�ѹ� ���� ��ġ�� 0���� ǥ���Ѵ�.
//		System.out.println(Arrays.toString(ball));
		for(int i=0; i<SIZE; i++) {
			int idx = rand.nextInt(MAX); // �ε��� �ȿ� ���� 1~45 ���ϴ�.
			lotto[i] = ball[idx]; 		// 
			ball[idx] = 0;
			if(ball[idx] == 0) {
				ball[idx] = rand.nextInt(MAX);
			}	
				
		}	System.out.println(Arrays.toString(lotto));
				
		

	}
}

//[1~45] ��°���� ���ɴϴ�.
//1���� 45 �߿� ���� �̾ƿ��� �̾ƿ��� ���ڴ� ���� ������Ʈ�� �ְ�
//�̾������� ���� ����Ʈ�� 0���� �����Ѵ�. 
//�� ��������Ʈ�� �̾ƿö� 0�̸� �н��ϵ��� �Ѵ�.