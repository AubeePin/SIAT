package Org.comstudy.ch15.ex03;

import java.util.StringTokenizer;

public class Ch15Ex03 {

	public static void main(String[] args) {
		String str1 = "1|�����|���α׷���|38|����� ���α� ��ö��";
		
		//���ڿ��� �����ϱ�
		StringTokenizer strtkz = new StringTokenizer(str1, "|");
		while(strtkz.hasMoreTokens()) {
			System.out.println(strtkz.nextToken());
		}
	}

}
