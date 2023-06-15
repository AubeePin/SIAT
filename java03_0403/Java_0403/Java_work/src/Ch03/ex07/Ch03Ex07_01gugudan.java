package Ch03.ex07;

import java.io.PrintStream;

public class Ch03Ex07_01gugudan {
   
   public PrintStream printf(String format, Object ... args) {
        return System.out.format(format, args);
    }
   
   public Ch03Ex07_01gugudan() {
      for(int dan=2; dan<=9; dan++) {
         gugudan(dan);
      }
   }

   public void gugudan(int dan) {
      printf("***%d***\n", dan);
      for(int cnt=1; cnt<=9; cnt++) {
         printf("%d*%d=%d\n", dan, cnt, dan*cnt);
      }
   }

   public static void main(String[] args) {
      //구구단 출력
      new Ch03Ex07_01gugudan();
   }

}