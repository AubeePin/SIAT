package chapter02.ex02_2;

import java.util.Scanner;

//클래스명과 파일명은 같아야 한다.
public class Ch02Ex02 {
	public Ch02Ex02() {
		// TODO Auto-generated constructor stub
		System.out.println("디폴트 생성자 호출");
	}
	//public 객체 외부에서 접근 가능, 상수나 메소드 만들때 주로 public 붙인다.
	//private 사적인, 객체외부에서 접근 불가능. (캡슐화) 필드 앞에 주로 선언.
	
	final static double PI = Math.PI;//(CLASS) 맴버 필드
	public String title = "원의 면적 구하는 프로그램";
	public static void main(String[] args) {// 매개 변수
		//final double PI = Math.PI; //(METHOD) 로컬 변수
		
		//가설, 검증
		// static 메서드 안에서 외부의 none-static 멤버 접근 불가.
		//System.out.println(PI);
		
		Scanner scan = new Scanner(System.in);
		System.out.println("성명 입력: ");
		String name = scan.next();
		System.out.println("성명은 " + name);
	}
	
	public static void 잡설01(String[] args) {
		
		//wysyg :눈에 보이는 대로 만들어진다. 
		//HTML, CSS, JS 자동 생성 툴(나모웹에디터,  Adobe 드림위버)
		//자바 소스코드 자동 생성 : 넥사크로, 마이플렛폼
		
		
	}

}
