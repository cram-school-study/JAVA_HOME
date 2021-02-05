class MyWallet {
	String name;
	int age;
	String address;
	private int wallet;
	
	MyWallet() {
		this("빵야빵야", 18, "부천시 고강동", 100);
	}
	MyWallet(String name, int age, String address, int wallet) {
		this.name = name;
		this.age = age;
		this.address = address;
		this.wallet = wallet;
	}
	
	void show_mywallet() {
		System.out.println("my wallet : " + wallet);
	}
	
	void pay_wallet(int pay) {
		wallet = wallet - pay;
		show_mywallet();
	}
}

public class Ex012_class_mywallet {
	public static void main(String[] args) {
		MyWallet jeong = new MyWallet("정원준", 28, "오정구", 10000);
		MyWallet start = new MyWallet();
		
		jeong.name = "이순신";
//		jeong.wallet = 200000;
		
		
		System.out.println("name : " + jeong.name);
		System.out.println("age : " + jeong.age);
		System.out.println("address : " + jeong.address);
//		System.out.println("wallet : " + jeong.wallet);
		jeong.show_mywallet();
		jeong.pay_wallet(7000);
	}
}
