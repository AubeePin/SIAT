package kame_ch16_ex01_1.set_ex;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class SetEx01 {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		
		set.add("���");
		set.add("ü��");
		set.add("�ٳ���");
		set.add("����");
		set.add("�޷�");
		set.add("����");
		set.add("���");
		//�����ؼ� 7�� ��ġ�°� ���

		System.out.println("set�� �ִ� ���빰 ���� �? (��ġ�°� ���ϴ�):"+ set.size()+"��");
		
		Iterator<String> items = set.iterator();
		while(items.hasNext()) {
			System.out.println(items.next());
		}
		System.out.println("========================================");
		
		String [] arr = new String[set.size()];
		set.toArray(arr);
		System.out.println(Arrays.toString(arr));
	}

}
