package ch06ex00;

import java.util.Arrays;

public class Ch06Ex01 {
	
	//���� �Ű�����(Varargs)��밡��
	static void print(int ... nums) {
		System.out.println("nums.length : " + nums.length);
		System.out.println(Arrays.toString(nums));
		System.out.println();
	}
	
	public static void main(String[] args) {
		print(10);
		print(20,30);
		print(40,50,60);
		print(70,80,90,100);
	}

}
