abstract class Unit {
	int x,y;
	abstract void move(int x, int y);
	void stop() {};
}

class Marine extends Unit {
	void move(int x, int y) {
		System.out.println("������ ��ǥ ["+ x +","+ y +"]���� �̵��մϴ�.");
		System.out.println("��Ÿ���� ���� ���� ��Ÿ�Ϸ�....");
	}
	
	void stimPack() {
		System.out.println("�������� ������ �����̴�. ��������");
	}
}

class Tank extends Unit {
	void move(int x, int y) {
		System.out.println("��ũ�� ��ǥ ["+ x +","+ y +"]���� �̵��մϴ�.");
		System.out.println("��Ÿ���� ���� ���� ��Ÿ�Ϸ�....");
	}
	
	void changeMode() {
		System.out.println("������� �Ϲݸ�� ���");
	}
}

class dropShip extends Unit {
	void move(int x, int y) {
		System.out.println("������� ��ǥ ["+ x +","+ y +"]���� �̵��մϴ�.");
		System.out.println("��Ÿ���� ���� ���ۼ� ��Ÿ�Ϸ�....");
	}
	
	void load() {
		System.out.println("������ �����մϴ�.");
	}
	
	void unload() {
		System.out.println("������ �����մϴ�.");
	}
}


public class Ex020_class_abstract_game {

	public static void main(String[] args) {
		Unit[] units = new Unit[3];
		units[0] = new Marine();
		units[1] = new Tank();
		units[2] = new dropShip();
		
		for(int i=0;i<units.length;i++) {
			units[i].move(500, 500);
		}
		
	}

}
