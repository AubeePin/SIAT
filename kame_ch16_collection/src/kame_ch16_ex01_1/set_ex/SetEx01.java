package kame_ch16_ex01_1.set_ex;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class SetEx01 {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		
		set.add("사과");
		set.add("체리");
		set.add("바나나");
		set.add("딸기");
		set.add("메론");
		set.add("포도");
		set.add("사과");
		//전부해서 7개 겹치는건 사과

		System.out.println("set에 있는 내용물 전부 몇개? (겹치는건 뺍니다):"+ set.size()+"개");
		
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
