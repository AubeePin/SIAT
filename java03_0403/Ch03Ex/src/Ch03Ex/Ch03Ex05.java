package Ch03Ex;

public class Ch03Ex05 {

	public static void main(String[] args) {
		// 1 - 3 + 5 - 7 + 9 = 5
		// 3. 조건 만든다.
		// 4. 증감식 만든다.
		// 5. 숫자 출력
		// 6. 부호를 붙인다
		// 7. 부호가 엇갈리게 출력되도록 한다.
		// 8. =을 붙인다.
		// 9. total에 누적
		// 10. total 출력
		
		int i =1;
		int total = 0;
	
		while (i <= 9) {
			
			if(i % 2 == 1) {
				total = total + i;
				
				System.out.print("+");
				
			}else {
				System.out.print("-");
			}
			
			i++;
			
		}
		System.out.println("="+total);
	}
}