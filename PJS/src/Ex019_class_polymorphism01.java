class Product1 {
	int price; //�� ��ǰ�� ����
	int bonusPoint; // ��ǰ ���Ž� ������ ���ʽ� ����Ʈ
	
	public Product1() {
	}
	
	public Product1(int price) {
		this.price = price;
		bonusPoint = (int) (price/10.0); // ���ʽ� ����Ʈ - ��ǰ�� ������ 10%
	}
}

class Tv1 extends Product1 {
	Tv1() {
		super(100); //�̰��� �ǹ̴� ������ ������ �� Product (int price)�� �����Ű�ڴٴ� �ǹ�
	}
	
	public String toString() {
		return "TV ����";
	}
}

class Computer extends Product1 {
	Computer() {
		super(200); 
	}
	
	public String toString() {
		return "Computer ����";
	}
}

class Audio extends Product1 {
	Audio() {
		super(50);
	}
	
	public String toString() {
		return "Audio ����";
	}
}

class Buyer {
	int money = 1000;
	int bonusPoint = 0;
	
	Product1[] cart = new Product1[20]; // ���̾ ������ ��ǰ�� �����ϱ� ���ؼ� ���� �迭
	
	int i = 0;
	
	void buy(Product1 p) {
		if(money < p.price) {
			System.out.println("������ �ܾ��� �����մϴ�. �����ϼ���");
			return;
		}
		
		money -= p.price;
		bonusPoint += p.bonusPoint;
		cart[i++] = p;
		System.out.println(p.toString()+"�ϼ̽��ϴ�! ~~");
	}
	
	void show_cart() {
		int sum=0;
		String itemList = "";
		
		for(int i=0;i<cart.length;i++) {
			if (cart[i] == null) break;
			sum += cart[i].price;
			itemList += cart[i] + ", ";
		}
		System.out.println("������ ��ǰ�� ������ "+ sum + "�Դϴ�.");
		System.out.println("�����Ͻ� ��ǰ���� " + itemList + "�Դϴ�.");
	}
}




public class Ex019_class_polymorphism01 {

	public static void main(String[] args) {
		Buyer b = new Buyer();
//		b.buy(new Tv1());
//		b.buy(new Computer());
//		b.buy(new Audio());
		
//		Product1[] p1 = new Product1[3];
//		p1[0] = new Tv1();
//		p1[1] = new Computer();
//		p1[2] = new Audio();

		Product1[] p1 = {new Tv1(), new Computer(), new Audio()};
		
		for (int i=0; i<p1.length; i++) {
			b.buy(p1[i]);
		}	
		b.show_cart();
	
		System.out.println("���� ������ �������� "+ b.money + "���� �Դϴ�.");
		System.out.println("���� ������ ���� ���ʽ� ����Ʈ�� "+ b.bonusPoint + "�� �Դϴ�.");
	}

}
