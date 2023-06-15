package org.comstudy.ch14;


abstract class 탈것 {
   String name;
   void start() {
      System.out.println(name + " 시동 켜기");
      run();
      System.out.println(name + " 시동 끄기");
   }
   
   abstract void run();
}

class 오토바이 extends 탈것 {
   @Override
   void run() {
      super.name = "오토바이";
      System.out.println("오토바이가 두바퀴로 달린다~");
   }
}

class 스포츠카 extends 탈것 {
   @Override
   void run() {
      super.name = "스포츠카";
      System.out.println("스포츠가가 네바퀴로 달린다~~");
   }
}

public class TemplateMethodEx {
   public static void main(String[] args) {
      탈것 bike = new 오토바이();
      bike.start();
      
      탈것 car = new 스포츠카();
      car.start();
   }
}