package org.comstudy.ch14;
// THread�� ��� ������ ������ Ŭ������ �ȴ�.
public class Ch14Ex01 extends Thread {
	// run()�޼ҵ带 ������ �ϰ� start()�� ����
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
		
		//main()�� Thread�̴�!
		for(int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread());
			Thread.sleep(500);//1000���� 1�� ���� �� 0.5��
		}
		
		
	}

}
