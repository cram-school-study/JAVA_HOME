abstract class UnitA {
	int x, y;
	abstract void move(int x, int y);
	void stop() {
		System.out.println("���� �մϴ�");
	}
}

interface Fightable {
	void move(int x, int y);
	void attach(Fightable f);	
}

class Fighter extends UnitA implements Fightable {
	public void move(int x, int y) {
		System.out.println(x+"x,"+y+" ��ǥ�� �̵�");
	};
	public void attach(Fightable f) {
		System.out.println(f+"�� �����϶� ~~");
	};
	
	Fightable getFightable() {
		Fighter fighter = new Fighter();
		return fighter;
	}
}

public class Ex22_class_FighterTest {
	public static void main(String[] args) {
//		Fighter f = new Fighter();
//		�����⸸ �ִ� �������̽� ��ü �����
		Fightable f2 = new Fighter();
		f2.move(200, 200);
//		f2.stop();
		f2.attach(new Fighter()); // ������ ����
		
	}
}
