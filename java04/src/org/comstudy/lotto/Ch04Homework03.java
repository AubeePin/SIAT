package org.comstudy.lotto;

import java.util.Arrays;
import java.util.Random;

public class Ch04Homework03 {
	
   public static final int SIZE = 6;//[]안에 넣을 로또 번호의 갯수
   public static final int MAX = 6;//최대번호수
   public static final Random rand = new Random();

   public static void main(String[] args) {
      int[] lotto = new int[SIZE];// 인덱스 안에 로또 번호는 6자리만 넣는다.(랜덤으로)
      
      for(int i = 0; i<SIZE; i++){//만약에 i가 0으로 시작하고 /i<6 즉 i는 0부터 5개까지 /i 증가
    	  lotto[i] = 1+rand.nextInt(MAX);
    	  for(int j = 0; j<i; j++) { //j는 0부터 시작/j와 i 같고 작다./j++증가함.
    		  if(lotto[i] == lotto[j]) {
    			  lotto[i] = 1+rand.nextInt(MAX); 
    			  System.out.println(i);
    			 j= -1;
    			  //i=0;
    			  //j=0;
    			 
    		  }
    	  }   
   	   } 
      System.out.println(Arrays.toString(lotto));
   	}	
}
//	힌트?...
//같은 게 있다면 0번째로 다시 가서 비교하라는 거지?
//			0 번째 0번째 이렇게 언제? 로또에 i번째에 있는 거를 로또에 j가 되면 되잖아요. 아닌가?
//					힌트 다 줬다!
//					답을 가르쳐줘버렸네!
//					자, 쉬었다가 쉬었다가 같이 해봅시다.
//					-(쉬는 시간)
//					　
