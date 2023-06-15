package org.comstudy.ch03;

import java.util.Arrays;

public class Ch03_062 {

	public static void main(String[] args) {
		int[] arr = new int[] {1,2,3,4,5}; //뉴 인트가 뭐지? 
		
		System.out.println(Arrays.toString(arr));
		
		int[] arr2 = arr;
		arr[0] *= 100;
		arr[1] *= 100;
		arr[2] *= 100;
		arr[3] *= 100;
		arr[4] *= 100;
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr2));
		
	}

}
