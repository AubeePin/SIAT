package org.comstudy.ch14;

public class practice implements Runnable {
	
	public void run() {
		for(int i = 0; i<100; i++) {
			System.out.println("두번째 실");
			try {
//				synchronized (this) {
//					if(flag) {
//						this.wait();
//					}
//				}
				Thread.sleep(100);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			
		}
	}
//	void stop() {
//		System.out.println("여기서 잠깐 쉬다갑니다~");
//		flag = true;
//	}
//	void depart() {
//		flag = false;
//	}
	
	public static void main(String[] args) {
		practice target = new practice();
		Thread thread = new Thread(target);
		thread.start();
		
		for(int i=0; i<100; i++) {
			System.out.println("첫번째 실");
			try {
				if(i==30) {
					synchronized (thread) {
//						target.stop();
					}
				}
				Thread.sleep(100);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	}
}
