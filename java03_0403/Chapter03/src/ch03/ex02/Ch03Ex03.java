package ch03.ex02;

public class Ch03Ex03 {

	public static void main(String[] args) {
		//1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10 = 55
		final int MAX = 10;
		for(int i=1; i<=MAX; i++) {
			System.out.println(i);
			System.out.println(i<MAX ? "+":"=");
		}

	}

}
