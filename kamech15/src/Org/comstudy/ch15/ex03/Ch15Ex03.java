package Org.comstudy.ch15.ex03;

import java.util.StringTokenizer;

public class Ch15Ex03 {

	public static void main(String[] args) {
		String str1 = "1|김범준|프로그래머|38|서울시 종로구 관철동";
		
		//문자열을 분해하기
		StringTokenizer strtkz = new StringTokenizer(str1, "|");
		while(strtkz.hasMoreTokens()) {
			System.out.println(strtkz.nextToken());
		}
	}

}
