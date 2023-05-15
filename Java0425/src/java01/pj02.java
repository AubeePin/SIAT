package java01;

public class pj02 {

	  public static void main(String[] args) {
	      for(int i=0; i<5; i++){
	         for(int j=0;j<5-i; j++) {
	            System.out.printf("*");
	         }
	         for(int a=0;a<(i*2)-1;a++) {
	            System.out.printf(" ");
	         }
	         for(int j=0;j<5-i;j++) {
	            if(i==0&&j==0)
	            {
	               System.out.print("");
	            } 
	            else
	               System.out.printf("*");
	         }
	         System.out.println();
	   

	      }


	  }
	  
}

