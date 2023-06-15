package org.comstudy.lotto;//챕터04장

import java.util.Random;

public class Ch04Homework01 {
	//상수 선언
	public static final int SIZE = 6; //final 붙인거는 못고친다는 선언(상수) 클래스선언할때 파이널 붙이면 상속불가능
	public static final int MAX = 6;
	public static final Random rand = new Random();
	
	
	public static void main(String[] args) {
		//로또 번호를 저장 할 배열 선언
		int[] lotto= new int[SIZE];
		
		//제어문만 이용해서 로또번호 생성(번호 중복 안되게)
		int idx =0;//인덱스가 0번부터시작합니다. 
		while(idx < SIZE) {//인덱스 0번부터 사이즈는 6번까지니까 0~5번 인덱스 나옵니다.
			//System.out.println(idx); 제대로 나오는지 확인.
			
			lotto[idx] = 1+rand.nextInt(MAX);//1 ~ 45
			
			//요구 사항 분석(문제의 정의를 파악하기)
			//lotto[idx]번째 요소의 값과 동일한 값이 lotto배열에 있나? 하는 살펴보기.
			//겹치면안되니까 반복문을 좀더 넣을것.(문제에 답이 있다)
			//lotto배열의 요소를 순서대로 뽑아서 lotto[idx]번째 요소의 값과 비교
			//순서대로 뽑기 -->반복문
			for(int j = 0; j<idx; j++) {
				if(lotto[j] == lotto[idx]) {
					idx--;
					break;
//					idx= idx-j;
				}
			}
			idx++;
		}
		//배열에 저장된 요소값 확인
		//for(int i = 0; i<SIZE; i++) {
		for(int i = 0; i<SIZE; i++) { //이방법 써도되구 밑방법써도됨. length는 로또가 갖고잇는사이즈
			System.out.printf("%d\t", lotto[i]);//역슬랙시 티는 탭 줄바꿈임
		}
	}
}
