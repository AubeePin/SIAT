package ch03.ex01;

class KKK{
	public void kkkFn() {
		System.out.println("kkkFn�Լ� ȣ��");
	}
	

//public���� Ŭ������ ���ϸ�� �����ؾ��Ѵ�.
//public ���� �����ڰ� ����������

//public class Ch03Ex02 {
	
	//����Ʈ ���� ������(���� �� ��)
	//package ���� : ����Ʈ ���� �����ڴ� ���� ���� ������ ���� ����.
	void start() {
		
	}
	String sayHello(String name) {
		
		return null;
	}
	short sum(int a,int b){
		return (short)(a+b);
	}
	
	public static void main(String[] args) {
		//Ŭ���� ���� = new Ŭ����();
		//����.�޼���();
		KKK k = new KKK();
		k.kkkFn();
		
		Ch03Ex02 ex = new Ch03Ex02();
	
		//���� �޼������ ���� ���� �����ϵ��� �޼��带 ���� �϶�.
		
		ex.start();
		ex.sayHello("�浿��");
		int result = ex.sum(10,12);
	}

	private int sum(int i, int j) {
		System.out.println("result="+result);
		return 0;
	}

	private int result;

	private void sayHello(String string) {
		System.out.println("�浿��");
		
	}

	private void start() {
		System.out.println("start()�޼ҵ� ȣ��");		
	}

	private int result() {
		System.out.println(result+result());
		return 0;
	}
}
