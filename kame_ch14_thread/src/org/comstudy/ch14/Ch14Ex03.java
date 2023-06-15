package org.comstudy.ch14;

public class Ch14Ex03 implements Runnable {
	
   boolean flag = false;
//-------------------------------------------------------------------   
   @Override
   public void run() {
      for(int i=0; i<100; i++) {         
         System.out.println("���ʺ� ������");
         try {
            Thread.sleep(100);//0.1�� ī��Ʈ
 //------------------------------------------------------------------100���� �����߿�           
            synchronized (this) {// wait���ǿ� �°� ����. ���κκп� ������ ���մ�.
               if(flag) {//�����带 �����Ϸ���  ��ũ�ξȿ��� ��? �ȿ� ������ �����Ѵ�.
                  this.wait();
               }
            }
         } catch (InterruptedException e) {}// �ߴܵ� ���� +������ e
      }
      // wait / notifyAll
      // ������ ����ȭ : synchronized �� Ȱ��
   }
 //-----------------------------------------------------------------
   void pause() {
      System.out.println("���ʺ��� pause() ȣ��");
      flag = true;//���� �����̸�  ���� �ݺ��ϰԲ� ����°ǰ���?
   }
   
   void restart() {
      flag = false; //�޽��� ����ɰ���  ������ ��2�� �����忡 ���� �޽� ����Ǹ� �״�� 100���� ���ٴ¶�.
      synchronized (this) {//(�� ���κ��� 20~30 �ʾ����ͻ�)
         this.notifyAll();//�ٽÿ����̰��ϴ°�
      }
   }
//--------------------------------------------------------------------   
   public static void main(String[] args) {
      Ch14Ex03 target = new Ch14Ex03();
      Thread thread = new Thread(target);
      thread.start();
      
      for(int i=0; i<100; i++) {   
         System.out.println("main ������");
         // i�� 30���� �Ǿ����� run�� �����Ѵ�.
         // i�� 50���� �Ǿ����� run�� �� ����
         try {
            if(i == 30) {
               synchronized (thread) {// ��ũ��?��������? -> �ټ��ִ�. ������ΰ��°� /�������� ���涧 ������ �����ִ�.
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