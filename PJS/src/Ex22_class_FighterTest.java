abstract class UnitA {
	int x, y;
	abstract void move(int x, int y);
	void stop() {
		System.out.println("정차 합니다");
	}
}

interface Fightable {
	void move(int x, int y);
	void attach(Fightable f);	
}

class Fighter extends UnitA implements Fightable {
	public void move(int x, int y) {
		System.out.println(x+"x,"+y+" 좌표로 이동");
	};
	public void attach(Fightable f) {
		System.out.println(f+"를 공격하라 ~~");
	};
	
	Fightable getFightable() {
		Fighter fighter = new Fighter();
		return fighter;
	}
}

public class Ex22_class_FighterTest {
	public static void main(String[] args) {
//		Fighter f = new Fighter();
//		껍데기만 있는 인터페이스 객체 만들기
		Fightable f2 = new Fighter();
		f2.move(200, 200);
//		f2.stop();
		f2.attach(new Fighter()); // 다형성 지원
		
	}
}
