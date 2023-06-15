package ch05_03;

class Cannon extends Weapon{
	@Override
	protected int  fire() {//오버라이딩
		return 10;
	}
}

public class Overriding {
	public static void main(String[] args) {
		Weapon weapon;
		weapon = new Weapon();
		System.out.println("기본 무기 살상 능력 >>" + weapon.fire());
		
		weapon = new Cannon();
		System.out.println("대포 살상 능력 >>" + weapon.fire());
	}

}
