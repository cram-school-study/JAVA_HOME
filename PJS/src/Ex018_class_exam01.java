class Car1 {
	String color;
	int door;
	
	void drive() {
		System.out.println("��������, �ο��� ~~~~~~");
	}
	
	void stop() {
		System.out.println("����,, ����ϴ�.");
	}
}

class FireEngin extends Car1 {
	void water() {
		System.out.println("���� �Ѹ��ϴ�.");
	}
}


public class Ex018_class_exam01 {
	public static void main(String[] args) {
		Car1 car1 = null;
		FireEngin fireEngin1 = new FireEngin();
		FireEngin fireEngin2 = null;
		
		fireEngin1.water();
		
		car1 = (Car1)fireEngin1; //(Car) ����ȯ�� ���� ����, �� ������ �� �ֳ�.. �������� ���������� �����̱⶧��
		car1 = fireEngin1; //(Car1) ����ȯ�� ���� ����, �� ������ �� �ֳ�.. �������� ���������� �����̱⶧��
		//car1.water(); ���� ����ȯ �ϸ鼭 ���ư�
		car1.drive();
		
		fireEngin2 = fireEngin1;
		fireEngin2.water();
		
		fireEngin2 = (FireEngin)car1; // (FireEngin) ����ȯ�� ���� �Ұ���, ������ ������ ���� �ڼ��̱� ����
		fireEngin2.water(); // ����
		
		
	}
}
