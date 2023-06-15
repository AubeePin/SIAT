package org.comstudy.ch14;


public class Ch14Ex02 implements Runnable{
	//템플릿 메소드 패턴과 유사한 형태
	@Override
	public void run() {
		System.out.println("Runnable :" + Thread.currentThread());
		
	}
	public static void main(String[] args) {
		//1. Runnable 객체 생성
		Runnable target = new Ch14Ex02();
		//2. Thread 객체로 변환
		Thread thread = new Thread(target);
		thread.start();
	}
}
