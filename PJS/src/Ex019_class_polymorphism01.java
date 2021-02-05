class Product1 {
	int price; //그 제품의 가격
	int bonusPoint; // 제품 구매시 돌려줄 보너스 포인트
	
	public Product1() {
	}
	
	public Product1(int price) {
		this.price = price;
		bonusPoint = (int) (price/10.0); // 보너스 포인트 - 제품의 가격의 10%
	}
}

class Tv1 extends Product1 {
	Tv1() {
		super(100); //이것의 의미는 조상의 생성자 즉 Product (int price)를 실행시키겠다는 의미
	}
	
	public String toString() {
		return "TV 구입";
	}
}

class Computer extends Product1 {
	Computer() {
		super(200); 
	}
	
	public String toString() {
		return "Computer 구입";
	}
}

class Audio extends Product1 {
	Audio() {
		super(50);
	}
	
	public String toString() {
		return "Audio 구입";
	}
}

class Buyer {
	int money = 1000;
	int bonusPoint = 0;
	
	Product1[] cart = new Product1[20]; // 바이어가 구입한 제품을 저장하기 위해서 만든 배열
	
	int i = 0;
	
	void buy(Product1 p) {
		if(money < p.price) {
			System.out.println("지갑에 잔액이 부족합니다. 충전하세요");
			return;
		}
		
		money -= p.price;
		bonusPoint += p.bonusPoint;
		cart[i++] = p;
		System.out.println(p.toString()+"하셨습니다! ~~");
	}
	
	void show_cart() {
		int sum=0;
		String itemList = "";
		
		for(int i=0;i<cart.length;i++) {
			if (cart[i] == null) break;
			sum += cart[i].price;
			itemList += cart[i] + ", ";
		}
		System.out.println("구입한 제품의 총합은 "+ sum + "입니다.");
		System.out.println("구입하신 제품들은 " + itemList + "입니다.");
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
	
		System.out.println("현재 지갑에 남은돈은 "+ b.money + "만원 입니다.");
		System.out.println("현재 지갑에 남은 보너스 포인트는 "+ b.bonusPoint + "점 입니다.");
	}

}
