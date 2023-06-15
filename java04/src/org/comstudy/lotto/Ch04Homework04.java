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
		//static 초기화 블럭(생성자보다 먼저 실행 되는 부분
		for(int num = 1; num<=MAX; num++) {
			ball[num-1] = num;//0부터 45까지 나오는데 이걸 한국식으로 변경하면 1부터 46입니다 그래서 -1
		}
	}

	public static void main(String[] args) {
//		int[] ball = int [MAX];
//		ball의 랜덤한 위치에서 num을 뽑아온다.
//		6번 반복
//		한번 뽑은 위치는 0으로 표시한다.
//		System.out.println(Arrays.toString(ball));
		for(int i=0; i<SIZE; i++) {
			int idx = rand.nextInt(MAX); // 인덱스 안에 랜덤 1~45 들어갑니다.
			lotto[i] = ball[idx]; 		// 
			ball[idx] = 0;
			if(ball[idx] == 0) {
				ball[idx] = rand.nextInt(MAX);
			}	
				
		}	System.out.println(Arrays.toString(lotto));
				
		

	}
}

//[1~45] 출력결과가 나옵니다.
//1부터 45 중에 숫자 뽑아오면 뽑아오는 숫자는 따로 새리스트에 넣고
//뽑아져버린 기존 리스트엔 0으로 변경한다. 
//또 기존리스트를 뽑아올때 0이면 패스하도록 한다.