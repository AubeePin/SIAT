package Org.comstudy.ch15.ex01;

public class Ch15Ex03 {

	public static void main(String[] args) {
		String str1 = "1|김범준|프로그래머|38";
		
		//StringBuffer는 오토박싱 지원 안함.
		//string의 오토박싱 결점을 보완하기 위해 새로 추가된 클래스이다.
		//오토박싱 대신 new를 이용해서 객체 생성 해야 한다.
		//StringBuffer strbf = new StringBuffer();
		StringBuffer strbf = new StringBuffer();
		strbf.append(str1);
		strbf.append("|comstudy21@naver.com");
		
		//프로그래머 -> 개발자 변경
		String s = "프로그래머";
		int start = strbf.indexOf(s);
		int end = start + s.length();
		strbf.replace(start, end, "탁구선수");
		
		System.out.println(strbf);
		
	}
		
	public static void test(String[] args) {
		String str1 = "1|김범준|프로그래머|38";	
		int idx = str1.indexOf("프로그래머");//인덱스에 잇는 프로그래머는 인덱스몇에잇을까?
		System.out.println("idx = "+ idx);//그걸 출력한다.
		
		//String은 불변 객체이므로 결과를 반환 받아야 한다. 
		str1 = str1.replace("프로그래머", "개발자");//변경하고싶으면 변수명 지정한후에 변경할거 넣고
		System.out.println(str1);//변수명을 넣으면 변경됩니다.
	}

}
