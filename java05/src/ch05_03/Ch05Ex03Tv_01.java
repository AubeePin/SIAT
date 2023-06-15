package ch05_03;

interface TV {
   // �߻�޼ҵ�, ��� �ʼ� ���(���� ��� �ζ��)
   // public static final ���� �Ǿ �����Ϸ��� �߰� �Ѵ�.
   String name = "TV";
   void powerOn();
}

class SamsungTV implements TV {
   public void powerOn() {System.out.println("�Ｚ "+ TV.name + " �ѱ�");}
}

class LgTV implements TV {
   public void turnOn() {System.out.println("LG "+ TV.name +" �ѱ�");}
   @Override
   public void powerOn() {
      turnOn();
   }
}

public class Ch05Ex03Tv_01 {
   // ��ĳ����
   public static void TvRunner(TV tv) {
      tv.powerOn();
   }
   
   public static void main(String[] args) {
      TvRunner(new SamsungTV());
      TvRunner(new LgTV());
   }

}