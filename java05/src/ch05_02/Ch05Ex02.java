package ch05_02;

abstract class ��� {
	public abstract void ����(); 
}

class ��� extends ���{
	@Override
	public void ����() {
		System.out.println("��� �Ƶ��� �����Ѵ�.");
	}
}

public class Ch05Ex02 {

	public static void main(String[] args) {
		//�߻� �޼ҵ�� ���� ���� ���� ����.
		��� ���� = new ���();
		����.����();
	}

}
