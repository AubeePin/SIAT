package org.comstudy.ch14;


abstract class Ż�� {
   String name;
   void start() {
      System.out.println(name + " �õ� �ѱ�");
      run();
      System.out.println(name + " �õ� ����");
   }
   
   abstract void run();
}

class ������� extends Ż�� {
   @Override
   void run() {
      super.name = "�������";
      System.out.println("������̰� �ι����� �޸���~");
   }
}

class ������ī extends Ż�� {
   @Override
   void run() {
      super.name = "������ī";
      System.out.println("���������� �׹����� �޸���~~");
   }
}

public class TemplateMethodEx {
   public static void main(String[] args) {
      Ż�� bike = new �������();
      bike.start();
      
      Ż�� car = new ������ī();
      car.start();
   }
}