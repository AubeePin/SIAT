package Ch03Ex;

public class Ch03Ex05 {

	public static void main(String[] args) {
		// 1 - 3 + 5 - 7 + 9 = 5
		// 3. ���� �����.
		// 4. ������ �����.
		// 5. ���� ���
		// 6. ��ȣ�� ���δ�
		// 7. ��ȣ�� �������� ��µǵ��� �Ѵ�.
		// 8. =�� ���δ�.
		// 9. total�� ����
		// 10. total ���
		
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