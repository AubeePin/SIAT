package ch04;

class SingleTone {
   private static SingleTone instance;
   
   private SingleTone() {
      // TODO Auto-generated constructor stub
   }
   
   public static SingleTone getInstance() {
      if(instance == null) {
         instance = new SingleTone();
      }
      return instance;
   }
   
   public void run() {
      System.out.println("���� ...");
   }
}

public class SingleToneEx {
   // �ν��Ͻ��� ���� 1������ Ŭ���� 
   public static void main(String[] args) {
      //SingleTone st = new SingleTone();
      SingleTone st = SingleTone.getInstance(); // Ŭ���� �̸����� ����(static)
      st.run();
   }
}