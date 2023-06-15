package ch03.ex01;

public class Ch03Ex03 {
	
	String hello(String str1, String str2){
		return str1 + " " + str2;
	}

	public static void main(String[] args) {
		Ch03Ex03 obj = new Ch03Ex03();
		
		String greet = obj.hello("Hello world","±Êµø¿Ã");
		System.out.println("Message :" +greet);
	}

	

}
