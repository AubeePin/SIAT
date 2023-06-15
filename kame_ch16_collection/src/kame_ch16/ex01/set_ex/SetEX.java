package kame_ch16.ex01.set_ex;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class SetEX {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		
		set.add("사과");
		set.add("바나나");
		set.add("귤");
		set.add("오렌지");
		set.add("바나나");
		
		System.out.println("set에 담긴 내용은 몇개? " + set.size());
		
		//열거자 - Iterator
		Iterator<String> items = set.iterator();
		while(items.hasNext()) {
			System.out.println(items.next());
		}
		System.out.println("==========================");
		
		String[] arr = new String[set.size()];
		set.toArray(arr);
		
		System.out.println(Arrays.toString(arr));
	
	}
//각자 지금까지 한 것을 다시 한번 구현하고
	//Lotto번호 생성기를 Set을 활용해서 구현 해 보세요.
}
