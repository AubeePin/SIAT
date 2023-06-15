package ch06ex00.challenge;

import java.util.Arrays;
import java.util.Hashtable;
import java.util.Scanner;

public class Ch06Challenge {
		
	
	static String readString() {
      StringBuffer sb = new StringBuffer(); // Ű �Է��� ���� ��Ʈ�� ���� ����
      Scanner scan = new Scanner(System.in);
   
      
      while(true) {
         String line = scan.nextLine(); // �ؽ�Ʈ�� �� ������ �д´�.
         if(";".equals(line)) break; // ';'�� �մ� ���̾��̸� -> �Է³�
         sb.append(line); // ���� ���� ���ڿ��� ��Ʈ�� ���ۿ� �߰��Ѵ�.
      }
      return sb.toString(); // ��Ʈ�� ������ ���ڿ��� ��Ʈ������ ����
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