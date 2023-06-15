package kame_ch16ex00;

import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;

import Org.comstudy.ch15.ex01.Saram;

public class MapEx {

	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("김범준", "010-1111-1111");
		map.put("박일순", "010-2222-2222");
		map.put("최승현", "010-3333-3333");
		map.put("서민경", "010-4444-4444");
		map.put("최준석", "010-5555-5555");
		map.put("권동우", "010-6666-6666");
		map.put("안준원", "010-7777-7777");
		map.put("임명철", "010-8888-8888");
		map.put("서형원", "010-9999-9999");
		map.put("김은우", "010-1010-1010");
		map.put("이나라", "010-1100-0011");
		map.put("김재훈", "010-1212-1212");
		
		Iterator<String> keys = map.keySet().iterator();
		while(keys.hasNext()) { //키셋
			String key = keys.next();
			System.out.println(key + " : " + map.get(key));
		}
	}
}
//Enumeration<Saram> e= Collections.enumeration(saramList);
//
//while(e.hasMoreElements()) {//이너머레이션
//	  System.out.println(e.nextElement());//리스트
