package ch03.ex01;

class KKK{
	public void kkkFn() {
		System.out.println("kkkFn함수 호출");
	}
	

//public붙은 클래스는 파일명과 동일해야한다.
//public 접근 지정자가 붙지않으면

//public class Ch03Ex02 {
	
	//디폴트 접근 지정자(생략 할 시)
	//package 접근 : 디폴트 접근 지정자는 같은 폴더 내에서 접근 가능.
	void start() {
		
	}
	String sayHello(String name) {
		
		return null;
	}
	short sum(int a,int b){
		return (short)(a+b);
	}
	
	public static void main(String[] args) {
		//클래스 변수 = new 클래스();
		//변수.메서드();
		KKK k = new KKK();
		k.kkkFn();
		
		Ch03Ex02 ex = new Ch03Ex02();
	
		//다음 메서드들이 정상 실행 가능하도록 메서드를 구현 하라.
		
		ex.start();
		ex.sayHello("길동이");
		int result = ex.sum(10,12);
	}

	private int sum(int i, int j) {
		System.out.println("result="+result);
		return 0;
	}

	private int result;

	private void sayHello(String string) {
		System.out.println("길동이");
		
	}

	private void start() {
		System.out.println("start()메소드 호출");		
	}

	private int result() {
		System.out.println(result+result());
		return 0;
	}
}
