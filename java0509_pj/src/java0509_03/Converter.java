package java0509_03;


import java.util.Scanner;

// 템플릿 메소드 패턴과 유사하다.
public abstract class Converter {
   protected double ratio;
   
   abstract protected double convert(double src);
   abstract protected String getSrcString();
   abstract protected String getDestString();
   
   
   
   public void run() {
      Scanner scan = new Scanner(System.in);
      System.out.println(getSrcString() + "을" + getDestString() + "로 바꿉니다.");
      System.out.println(getSrcString() + "을 입력하세요>> ");
      double val = scan.nextDouble();
      double res = convert(val);
      System.out.println("변환 결과: "+ Math.round(res*100)/100.0 + getDestString() + "입니다.");
      scan.close();
      
   }
   
}
