package Ch03Ex;

import static org.comstudy21.io.MyUtils.*;




public class Ch03Ex09StarWars02 {

	public static void main(String[] args) {
		  // *
	      // **
	      // ***
	      // ****
	      // *****
	      // ****
	      // ***
	      // **
	      // *
		  int end = 1;
	      for(int i=0; i<9; i++) {
	         for(int j=0; j<end; j++) {
	            printf("*");
	         }
	         printf("\n");
	         end = i<4 ? end+1 : end-1;
	      }


		
		
		
	     // °úÁ¦
	      // 0 : *****
	      // 1 :  ****
	      // 2 :   ***
	      // 3 :    **
	      // 4 :     *
	      
	      
	      // *
	      // **
	      // ***
	      // ****
	      // *****
	      // ****
	      // ***
	      // **
	      // *
	      
	      //     *
	      //    **
	      //   ***
	      //  ****
	      // *****
	      //  ****
	      //   ***
	      //    **
	      //     *
	}

}
