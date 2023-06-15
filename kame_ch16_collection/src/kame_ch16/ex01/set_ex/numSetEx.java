package kame_ch16.ex01.set_ex;

import java.util.HashSet;
import java.util.Random;



public class numSetEx {

	public static void main(String[] args) {
		HashSet<Random>  set = new HashSet<Random>();
		
		//랜덤함수 이용하기
		Random rand = new Random();
		for(int i = 1 ; i < 7 ; i++) {
		 System.out.println("Lotto : " + rand.nextInt(45)); // 0~29
		}

		
		
	
		System.out.println("==========================");
		
//		String[] arr = new String[set.size()];
//		set.toArray(arr);
//		
//		System.out.println(Arrays.toString(arr));
	
	}

}
