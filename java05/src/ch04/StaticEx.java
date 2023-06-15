package ch04;

class Account{
	String name;
	int money;
	static int total;
	static int count;
	
	public Account(String name, int money) {
		this.name = name;
		this.money = money;
		total += money;
		count++;
	}
	
}

public class StaticEx {

	public static void main(String[] args) {
		Account kim = new Account("�浿��", 3000);
		Account hong = new Account("ȫ�浿��", 2000);
		Account park = new Account("�ڱ浿��", 5000);
		
		System.out.println("total = " + Account.total);
		System.out.println("count = " + Account.count);//3
		
		System.out.println("park.count = " + park.count);//3
		System.out.println("hong.count = " + hong.count);//3
		System.out.println("kim.count = " + kim.count);//3
		
		System.out.println("�ھ�.�� ="+ park.money);
	}

}
