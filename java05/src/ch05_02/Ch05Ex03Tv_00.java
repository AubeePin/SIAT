package ch05_02;

abstract class TV {
   public abstract void powerOn();
}

class SamsungTV extends TV {
   public void powerOn() {
      System.out.println("삼성 TV 켜기");
   }
}

class LgTV extends TV {
   public void turnOn() {
      System.out.println("LG TV 켜기");
   }

   @Override
   public void powerOn() {
      turnOn();
   }
}

public class Ch05Ex03Tv_00 {
   // 업캐스팅
   public static void TvRunner(TV tv) {
      tv.powerOn();
   }
   
   public static void main(String[] args) {
      TvRunner(new SamsungTV());
      TvRunner(new LgTV());
   }

}