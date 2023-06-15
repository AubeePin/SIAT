package org.comstudy.ch03;

import java.util.Arrays;

public class Ch03_063 {
		
	public static int[] concatArrr(int[] a1, int[] a2){
		int[] result = new int[a1.length + a2.length];//배열의 길이를 이용해서 새로운 배열을 비어있는 배열을 만드는것. 랭쓰는 배열의 길이!
		// 배열도 자바객체라서 생성을 해야함.  객체 생성하는 연산자임 뉴는! 자바에서 객체 생성할때 new를 꼭 써야합니다.
		//{10,20,30,40,50,60,70} 되도록 구현한다. /
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
