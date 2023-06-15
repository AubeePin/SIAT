package Ch03Ex;

public class Ch03Ex06 {

	public static void main_ex(String[] args) {
	      // 1 - 3 + 5 - 7 + 9 = 5
	      int num = 1;
	      int total = 0;
	      boolean flag = true; // 활용도가 높다. (권장한다)
	      final int MAX = 9;
	      
	      while(num<=MAX) {
	         System.out.print(num);
	         if(flag) {
	            total += num;
	            System.out.print(num<MAX ? "-" : "=");
	            flag = false;
	         } else {
	            total -= num;
	            System.out.print("+");   
	            flag = true;
	         }
	         
	         num+=2;
	      }
	      System.out.println(total);
	   } 
}
