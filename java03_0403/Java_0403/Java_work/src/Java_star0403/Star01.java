package Java_star0403;

import java.io.IOException;

public class Star01 {

	public static void main(String[] args) {
		int cnt = 1;
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				System.out.print(j > 4 - cnt && j < 4 + cnt ? "*" : "^");
			}

			System.out.println();
			cnt = i < 4 ? cnt + 1 : cnt - 1; 

			// System.out.print(j>size/2-cnt && j<size/2+cnt ? "*": "^");
			// }

			// System.out.println();
			// cnt= i<size/2 ? cnt + 1 : cnt - 1;

		}
	}

	
	public static int getNum() {
	      int num = 0;
	      int ch = 0;

	      try {
	         while((ch=System.in.read())!='\n') {
	            if(ch>='0' && ch<='9') {
	               num = num * 10 + ch - '0';
	            }
	         }
	      } catch (IOException e) {
	         e.printStackTrace();
	      }
	      return num;
	   }
	   
	   public static void ch02(String[] args) {
	      //       *
	      //      ***
	      //     *****
	      //    *******
	      //   *********
	      //    *******
	      //     *****
	      //      ***
	      //       *
	      
	      int cnt = 1;
	      System.out.print("Input Size : ");
	      int size = getNum();
	      for(int i=0; i<size; i++) {
	         for(int j=0; j<size; j++) {
	            //System.out.print(j<5-cnt || j>=4+cnt?"^":"*");
	            System.out.print(j>size/2-cnt && j<size/2+cnt?"*":"^");
	         }
	         
	         System.out.println();
	         cnt = i<size/2 ? cnt+1 : cnt-1;
	      }
	   }
}