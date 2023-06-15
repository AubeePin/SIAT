package Ch03.ex07;

import java.io.PrintStream;

public class Ch03Ex07gugudan {
   
   public PrintStream printf(String format, Object ... args) {
        return System.out.format(format, args);
    }
   
   public Ch03Ex07gugudan() {
      gugudanEx01();
   }
   
   public void gugudanEx01() {
      printf("***2단***\n");
      for(int i=2; i<3;i++) {
    	  for(int j=1;j<10;j++) {
    		  System.out.println("2*"+j+"= "+i*j);
    	  }
      }
      //*** 2단 출력하기
      //2*1=2
      //2*2=4
      //2*3=6
      //2*4=8
      //2*5=10
      //2*6=12
      //2*7=14
      //2*8=16
      //2*9=18
      
   }

   public static void main(String[] args) {
      //구구단 출력
      new Ch03Ex07gugudan();
   }

}