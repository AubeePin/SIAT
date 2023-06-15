package java0509_03;


import java.util.Scanner;

// ���ø� �޼ҵ� ���ϰ� �����ϴ�.
public abstract class Converter {
   protected double ratio;
   
   abstract protected double convert(double src);
   abstract protected String getSrcString();
   abstract protected String getDestString();
   
   
   
   public void run() {
      Scanner scan = new Scanner(System.in);
      System.out.println(getSrcString() + "��" + getDestString() + "�� �ٲߴϴ�.");
      System.out.println(getSrcString() + "�� �Է��ϼ���>> ");
      double val = scan.nextDouble();
      double res = convert(val);
      System.out.println("��ȯ ���: "+ Math.round(res*100)/100.0 + getDestString() + "�Դϴ�.");
      scan.close();
      
   }
   
}
