package Org.comstudy.ch15.ex01;

public class Ch15Ex03 {

	public static void main(String[] args) {
		String str1 = "1|�����|���α׷���|38";
		
		//StringBuffer�� ����ڽ� ���� ����.
		//string�� ����ڽ� ������ �����ϱ� ���� ���� �߰��� Ŭ�����̴�.
		//����ڽ� ��� new�� �̿��ؼ� ��ü ���� �ؾ� �Ѵ�.
		//StringBuffer strbf = new StringBuffer();
		StringBuffer strbf = new StringBuffer();
		strbf.append(str1);
		strbf.append("|comstudy21@naver.com");
		
		//���α׷��� -> ������ ����
		String s = "���α׷���";
		int start = strbf.indexOf(s);
		int end = start + s.length();
		strbf.replace(start, end, "Ź������");
		
		System.out.println(strbf);
		
	}
		
	public static void test(String[] args) {
		String str1 = "1|�����|���α׷���|38";	
		int idx = str1.indexOf("���α׷���");//�ε����� �մ� ���α׷��Ӵ� �ε����������?
		System.out.println("idx = "+ idx);//�װ� ����Ѵ�.
		
		//String�� �Һ� ��ü�̹Ƿ� ����� ��ȯ �޾ƾ� �Ѵ�. 
		str1 = str1.replace("���α׷���", "������");//�����ϰ������ ������ �������Ŀ� �����Ұ� �ְ�
		System.out.println(str1);//�������� ������ ����˴ϴ�.
	}

}
