package org.comstudy.ch14;

public class Ch14Ex03 implements Runnable {
	
   boolean flag = false;
//-------------------------------------------------------------------   
   @Override
   public void run() {
      for(int i=0; i<100; i++) {         
         System.out.println("러너블 쓰레드");
         try {
            Thread.sleep(100);//0.1초 카운트
 //------------------------------------------------------------------100까지 진행중에           
            synchronized (this) {// wait조건에 맞게 진행. 메인부분에 조건이 써잇다.
               if(flag) {//쓰레드를 제어하려고  싱크로안에서 블럭? 안에 쓰레드 제어한다.
                  this.wait();
               }
            }
         } catch (InterruptedException e) {}// 중단된 예외 +변수명 e
      }
      // wait / notifyAll
      // 스레드 동기화 : synchronized 블럭 활용
   }
 //-----------------------------------------------------------------
   void pause() {
      System.out.println("러너블의 pause() 호출");
      flag = true;//블럭을 진실이면  위에 반복하게끔 만드는건가요?
   }
   
   void restart() {
      flag = false; //펄스로 변경될경우는  맨위에 제2의 스레드에 보면 펄스 진행되면 그대로 100까지 간다는뜻.
      synchronized (this) {//(즉 메인보다 20~30 늦어진것뿐)
         this.notifyAll();//다시움직이게하는것
      }
   }
//--------------------------------------------------------------------   
   public static void main(String[] args) {
      Ch14Ex03 target = new Ch14Ex03();
      Thread thread = new Thread(target);
      thread.start();
      
      for(int i=0; i<100; i++) {   
         System.out.println("main 쓰레드");
         // i가 30정도 되었을때 run을 중지한다.
         // i가 50정도 되었을때 run을 재 시작
         try {
            if(i == 30) {
               synchronized (thread) {// 싱크로?나이지드? -> 줄서있다. 순서대로가는것 /병목현상 생길때 순서를 정해주는.
                  target.pause(); //
               }
            }
            if(i == 50) {
               synchronized (thread) {
                  target.restart();
               }
            }
            Thread.sleep(100);
         } catch (InterruptedException e) {}
      }
   }
}