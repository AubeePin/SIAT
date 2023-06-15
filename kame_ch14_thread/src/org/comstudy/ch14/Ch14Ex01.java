package org.comstudy.ch14;
// THread를 상속 받으면 쓰레드 클래스가 된다.
public class Ch14Ex01 extends Thread {
	// run()메소드를 재정의 하고 start()로 실행
	@Override
	public void run() {
		for(int i = 0; i < 10; i++) {
		System.out.print(Thread.currentThread()+"-");
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
	public static void main(String[] args) throws InterruptedException {
		Thread thread = new Ch14Ex01();
		thread.start();
		
		//main()도 Thread이다!
		for(int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread());
			Thread.sleep(500);//1000분의 1초 단위 즉 0.5초
		}
		
		
	}

}
