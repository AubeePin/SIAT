package ch03.ex02;

public class Ch03Ex02 {
	
	static final int MAX = 100;
	
	public static void main(String[] args) {
		//1~100������ 3�� ����� �����ϴ� �ݺ��� �����ϱ�
		int total = 0;
		int num = 1;
		
		//1~100���� �ݺ�
		for(int i = num; i<MAX; i++) {
			//3�� ������� �Ǻ�
			if(i%3 == 0) {
				total +=i;
			}
		}
		System.out.println("1~100���� 3�� ��� ���� ���� " + total);
	}

}
