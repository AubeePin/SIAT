package kame_ch16ex00;

import java.util.ArrayList;
import java.util.HashMap;

public class MaptoEx {

	public static void main(String[] args) {
		
		HashMap<String, Object> saram1 = new HashMap<String, Object>();
		saram1.put("no", 1);
		saram1.put("name", "김범준");
		saram1.put("phone","010-1111-1111");
		saram1.put("email", "kim@naver.com");
		
		HashMap<String, Object> saram2 = new HashMap<String, Object>();
		saram2.put("no", 2);
		saram2.put("name", "파이썬");
		saram2.put("phone","010-2222-2222");
		saram2.put("email", "pi@naver.com");
		
		HashMap<String, Object> saram3 = new HashMap<String, Object>();
		saram3.put("no", 3);
		saram3.put("name", "자바");
		saram3.put("phone","010-3333-3333");
		saram3.put("email", "java@naver.com");
		
		ArrayList<HashMap<String, Object>> list = new ArrayList<HashMap<String,Object>>();
		list.add(saram1);
		list.add(saram2);
		list.add(saram3);
		
		
		System.out.println("김범준의 프로필:" + saram1);
		System.out.println("파이썬의 프로필:" + saram2);
		System.out.println("자바의 프로필:" + saram3);
// [new Saram(), new Saram(), new Saram()]
// Saram 클래스 객체 사용.
// ArrayList<Saram> saramList = new ArrayList<Saram>();
// 자바 컬렉션을 최대한 활용한다.
// if문이 switch문 같은 제어문은 최대한 자제한다.
// 반복문도 가급적이면 Iterator, Enumeration으로 사용.
// TodoList 또는 주속록 구현 해서 까페에 제출.
// 숙제 제출 한 사람에게는 커피 선물
// 부정행위 적발시 커피값 벌금(다른 사람 커피 사 줌)
// 모르는걸 물어봐서 도움 받는것은 허용.
	}

}
