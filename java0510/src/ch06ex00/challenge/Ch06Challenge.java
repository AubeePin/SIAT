package ch06ex00.challenge;

import java.util.Arrays;
import java.util.Hashtable;
import java.util.Scanner;

public class Ch06Challenge {
		
	
	static String readString() {
      StringBuffer sb = new StringBuffer(); // 키 입력을 받을 스트링 버퍼 생성
      Scanner scan = new Scanner(System.in);
   
      
      while(true) {
         String line = scan.nextLine(); // 텍스트를 한 라인을 읽는다.
         if(";".equals(line)) break; // ';'만 잇는 라이언이면 -> 입력끝
         sb.append(line); // 읽은 라인 문자여을 스트링 버퍼에 추가한다.
      }
      return sb.toString(); // 스트링 버퍼의 문자열을 스트링으로 리턴
   }
   
	
   public static void main(String[] args) {
      
      Hashtable<String, Integer> histo = new Hashtable<String, Integer>();
      
      for(int i=0; i<='Z'-65; i++) {
         String key = "" + (char)(i+65);
         histo.put(key, 0);
      }
      
      for(int i=0; i<='Z'-65; i++) {
         String key = "" + (char)(i+65);
         System.out.println(key + ":" + histo.get(key));
      }
   }
}