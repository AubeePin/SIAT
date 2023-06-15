package Ch03Ex;




public class Ch03Ex01 {

	  public static void main(String[] args) {
	      // 1 + 2 - 3 + 4 - 5 + 6 - 7 + 8 - 9 + 10 = 7
	      final int MAX = 10;
	      int total=2;
	      for(int i=1;  i<=MAX; i++) {
	         // °úÁ¦
	    	  System.out.print(i);
	    	  if(i%2 == 1) {
	    		  total -=i;
	    		  System.out.print("+");
	    	  }else {
	    		  total += i;
	    		  System.out.print(i==MAX?"=":"-");
	    	  }
	      }
	      System.out.println(total);
	   }




	  public static void test(String[] args) {
	      // 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10 = 55
	      final int MAX = 10;
	      for(int i=1, total=0; i<=MAX; i++) {
	         System.out.print(i);
	         total += i;
	         System.out.print(i!=MAX ? "+" : "="+total);
	      }
	   }

	}