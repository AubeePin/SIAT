package kame_ch16ex00;

import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;

import Org.comstudy.ch15.ex01.Saram;

public class MapEx {

	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("�����", "010-1111-1111");
		map.put("���ϼ�", "010-2222-2222");
		map.put("�ֽ���", "010-3333-3333");
		map.put("���ΰ�", "010-4444-4444");
		map.put("���ؼ�", "010-5555-5555");
		map.put("�ǵ���", "010-6666-6666");
		map.put("���ؿ�", "010-7777-7777");
		map.put("�Ӹ�ö", "010-8888-8888");
		map.put("������", "010-9999-9999");
		map.put("������", "010-1010-1010");
		map.put("�̳���", "010-1100-0011");
		map.put("������", "010-1212-1212");
		
		Iterator<String> keys = map.keySet().iterator();
		while(keys.hasNext()) { //Ű��
			String key = keys.next();
			System.out.println(key + " : " + map.get(key));
		}
	}
}
//Enumeration<Saram> e= Collections.enumeration(saramList);
//
//while(e.hasMoreElements()) {//�̳ʸӷ��̼�
//	  System.out.println(e.nextElement());//����Ʈ
