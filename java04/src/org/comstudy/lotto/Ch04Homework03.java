package org.comstudy.lotto;

import java.util.Arrays;
import java.util.Random;

public class Ch04Homework03 {
	
   public static final int SIZE = 6;//[]�ȿ� ���� �ζ� ��ȣ�� ����
   public static final int MAX = 6;//�ִ��ȣ��
   public static final Random rand = new Random();

   public static void main(String[] args) {
      int[] lotto = new int[SIZE];// �ε��� �ȿ� �ζ� ��ȣ�� 6�ڸ��� �ִ´�.(��������)
      
      for(int i = 0; i<SIZE; i++){//���࿡ i�� 0���� �����ϰ� /i<6 �� i�� 0���� 5������ /i ����
    	  lotto[i] = 1+rand.nextInt(MAX);
    	  for(int j = 0; j<i; j++) { //j�� 0���� ����/j�� i ���� �۴�./j++������.
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
//	��Ʈ?...
//���� �� �ִٸ� 0��°�� �ٽ� ���� ���϶�� ����?
//			0 ��° 0��° �̷��� ����? �ζǿ� i��°�� �ִ� �Ÿ� �ζǿ� j�� �Ǹ� ���ݾƿ�. �ƴѰ�?
//					��Ʈ �� ���!
//					���� ����������ȳ�!
//					��, �����ٰ� �����ٰ� ���� �غ��ô�.
//					-(���� �ð�)
//					��
