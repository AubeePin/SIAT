package org.comstudy.lotto;//é��04��

import java.util.Random;

public class Ch04Homework01 {
	//��� ����
	public static final int SIZE = 6; //final ���ΰŴ� ����ģ�ٴ� ����(���) Ŭ���������Ҷ� ���̳� ���̸� ��ӺҰ���
	public static final int MAX = 6;
	public static final Random rand = new Random();
	
	
	public static void main(String[] args) {
		//�ζ� ��ȣ�� ���� �� �迭 ����
		int[] lotto= new int[SIZE];
		
		//����� �̿��ؼ� �ζǹ�ȣ ����(��ȣ �ߺ� �ȵǰ�)
		int idx =0;//�ε����� 0�����ͽ����մϴ�. 
		while(idx < SIZE) {//�ε��� 0������ ������� 6�������ϱ� 0~5�� �ε��� ���ɴϴ�.
			//System.out.println(idx); ����� �������� Ȯ��.
			
			lotto[idx] = 1+rand.nextInt(MAX);//1 ~ 45
			
			//�䱸 ���� �м�(������ ���Ǹ� �ľ��ϱ�)
			//lotto[idx]��° ����� ���� ������ ���� lotto�迭�� �ֳ�? �ϴ� ���캸��.
			//��ġ��ȵǴϱ� �ݺ����� ���� ������.(������ ���� �ִ�)
			//lotto�迭�� ��Ҹ� ������� �̾Ƽ� lotto[idx]��° ����� ���� ��
			//������� �̱� -->�ݺ���
			for(int j = 0; j<idx; j++) {
				if(lotto[j] == lotto[idx]) {
					idx--;
					break;
//					idx= idx-j;
				}
			}
			idx++;
		}
		//�迭�� ����� ��Ұ� Ȯ��
		//for(int i = 0; i<SIZE; i++) {
		for(int i = 0; i<SIZE; i++) { //�̹�� �ᵵ�Ǳ� �ع���ᵵ��. length�� �ζǰ� �����մ»�����
			System.out.printf("%d\t", lotto[i]);//�������� Ƽ�� �� �ٹٲ���
		}
	}
}
