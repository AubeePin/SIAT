package ch03;
import java.util.Scanner;

public class pj05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("금액을 입력해 주세요 >>> ");
		int money = scan.nextInt();
		
		int[] num = { 50000, 10000, 1000, 500, 100, 50, 10, 1}; // 환산할 돈의 종류 
			for(int i = 0; i < num.length; i++) {
				int nn = money/num[i];
				if(nn != 0) {
					System.out.println(num[i]+"원 짜리는 "+ nn +"개 있습니다.");
					money -= num[i]*nn; 
					// 만약 5만원 계산했으면 5만원꺼와 몫 합친 5만원짜리를 빼서  남은 머니를 가지고
					//다시 계산. 배열 끝날때가지.
				}
				
			}
	}

}
