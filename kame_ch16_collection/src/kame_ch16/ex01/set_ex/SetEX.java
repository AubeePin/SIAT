package kame_ch16.ex01.set_ex;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class SetEX {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		
		set.add("���");
		set.add("�ٳ���");
		set.add("��");
		set.add("������");
		set.add("�ٳ���");
		
		System.out.println("set�� ��� ������ �? " + set.size());
		
		//������ - Iterator
		Iterator<String> items = set.iterator();
		while(items.hasNext()) {
			System.out.println(items.next());
		}
		System.out.println("==========================");
		
		String[] arr = new String[set.size()];
		set.toArray(arr);
		
		System.out.println(Arrays.toString(arr));
	
	}
//���� ���ݱ��� �� ���� �ٽ� �ѹ� �����ϰ�
	//Lotto��ȣ �����⸦ Set�� Ȱ���ؼ� ���� �� ������.
}
