package ch03.ex01;

public class Ch03Ex01 {
	//����Ʈ �����ڴ� �����Ϸ��� �߰� �� �ش�.
	//�����ڰ� �����ڸ� ���� ����� �����Ϸ��� �����ڸ� ������ �ʴ´�.
	//������ ����� ����Ű : Ctrl + spaceber
	public Ch03Ex01() {
		//����Ʈ ������ (Default constructor)�� �Ű������� ����.
		//�����ڰ� ���� ����� �ִ�. 
		//�ڰ� �� ����� �����Ϸ��� ������ �� �ڵ� �߰� (�����ڰ� �־�� ������ ����)
		System.out.println("����Ʈ ������ ȣ�� ��");
	}
	public static void main(String[] args) {
		Ch03Ex01 ex01;//���� ���� ����
		//��ü ���� �� ���������� ������ ����
		new Ch03Ex01();//Constructor(������)����
		//�����ڴ� ���� ȣ�� �Ұ���. ���� ���� �Ҷ��� �ڵ� ȣ�� ��.
		//�ϴ� ��� �ִٰ� ���� �ϰ� ȣ���Ѵ�.
		//������ ������ crate method ������ ����
		ex01.start();
		
		ex01.sayHello("�浿��");
		
		int result = ex01.sum(10,12);
	}
	
	
	private void start() {
		System.out.println("start()");
		
	}
	private int sum(int i, int j) {
		// TODO Auto-generated method stub
		return 0;
	}
	private void sayHello(String string) {
		// TODO Auto-generated method stub
		
	}
	

}
