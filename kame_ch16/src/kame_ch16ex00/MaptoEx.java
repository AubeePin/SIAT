package kame_ch16ex00;

import java.util.ArrayList;
import java.util.HashMap;

public class MaptoEx {

	public static void main(String[] args) {
		
		HashMap<String, Object> saram1 = new HashMap<String, Object>();
		saram1.put("no", 1);
		saram1.put("name", "�����");
		saram1.put("phone","010-1111-1111");
		saram1.put("email", "kim@naver.com");
		
		HashMap<String, Object> saram2 = new HashMap<String, Object>();
		saram2.put("no", 2);
		saram2.put("name", "���̽�");
		saram2.put("phone","010-2222-2222");
		saram2.put("email", "pi@naver.com");
		
		HashMap<String, Object> saram3 = new HashMap<String, Object>();
		saram3.put("no", 3);
		saram3.put("name", "�ڹ�");
		saram3.put("phone","010-3333-3333");
		saram3.put("email", "java@naver.com");
		
		ArrayList<HashMap<String, Object>> list = new ArrayList<HashMap<String,Object>>();
		list.add(saram1);
		list.add(saram2);
		list.add(saram3);
		
		
		System.out.println("������� ������:" + saram1);
		System.out.println("���̽��� ������:" + saram2);
		System.out.println("�ڹ��� ������:" + saram3);
// [new Saram(), new Saram(), new Saram()]
// Saram Ŭ���� ��ü ���.
// ArrayList<Saram> saramList = new ArrayList<Saram>();
// �ڹ� �÷����� �ִ��� Ȱ���Ѵ�.
// if���� switch�� ���� ����� �ִ��� �����Ѵ�.
// �ݺ����� �������̸� Iterator, Enumeration���� ���.
// TodoList �Ǵ� �ּӷ� ���� �ؼ� ���信 ����.
// ���� ���� �� ������Դ� Ŀ�� ����
// �������� ���߽� Ŀ�ǰ� ����(�ٸ� ��� Ŀ�� �� ��)
// �𸣴°� ������� ���� �޴°��� ���.
	}

}
