package org.comstudy.ch14;


public class Ch14Ex02 implements Runnable{
	//���ø� �޼ҵ� ���ϰ� ������ ����
	@Override
	public void run() {
		System.out.println("Runnable :" + Thread.currentThread());
		
	}
	public static void main(String[] args) {
		//1. Runnable ��ü ����
		Runnable target = new Ch14Ex02();
		//2. Thread ��ü�� ��ȯ
		Thread thread = new Thread(target);
		thread.start();
	}
}
