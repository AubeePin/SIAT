package ch05_02;

abstract class TV {
   public abstract void powerOn();
}

class SamsungTV extends TV {
   public void powerOn() {
      System.out.println("�Ｚ TV �ѱ�");
   }
}

class LgTV extends TV {
   public void turnOn() {
      System.out.println("LG TV �ѱ�");
   }

   @Override
   public void powerOn() {
      turnOn();
   }
}

public class Ch05Ex03Tv_00 {
   // ��ĳ����
   public static void TvRunner(TV tv) {
      tv.powerOn();
   }
   
   public static void main(String[] args) {
      TvRunner(new SamsungTV());
      TvRunner(new LgTV());
   }

}