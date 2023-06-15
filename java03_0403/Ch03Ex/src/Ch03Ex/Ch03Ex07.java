package Ch03Ex;

public class Ch03Ex07 {
			// 숙제 : 피보나치 수열로 응용
		   // 1 + 1 - 2 + 3 - 5 + 8 - 13 + 21 = 14
		
	
	
	public static void main(String[] args) {
		//0 + 1 + 1 + 2 + 3 + 5 + 8 + 13 + 21 = 54
		final int MAX =21;
		int total = 0;
		for(int n=0, p=0, c=1; c <= 21; n=c+p, p=c, c=n) {
			
			System.out.print(c);
			total += c;
			System.out.print(c<MAX ? "+":"=");
	}
		System.out.print(total);
}	
	public static void main_pibo01(String[] args) {
		//Swap(벼룩시장 물물 교환(치환))알고리즘
		//다음 항 = (이전 항 + 현재 항)
		//이전 항 = 현재항;
		//현재 항 = 다음항
		//0 + 1 + 1 + 2 + 3 + 5 + 8 + 13 + 21 = 54
		int 다음항; 
		int 이전항 = 0;
		int 현재항 = 1;
		while(현재항 <= 21) {
			System.out.print(현재항+" ");
			
			다음항 = 현재항 + 이전항;
			이전항 = 현재항;
			현재항 = 다음항;
		}
		
	}

}
