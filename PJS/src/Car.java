public class Car {
	String color;
	String gearType;
	int door;
	String navigation;
	static String brand;
	
	
	Car() {
		brand = "����";
	}
	
	Car(String c, String g, int d, String n) {
		color = c;
		gearType = g;
		door = d;
		navigation = n;
	}
	
	public static void what_brand() {
		System.out.println("�������� �˴ϴ�.");
	}
	
	
	public static void main(String[] args) {
		Car c1 = new Car();
		c1.color = "white";
		c1.gearType = "auto";
		c1.door = 4;
		c1.navigation = "���̳���";
		
		Car c2 = new Car("white", "auto", 4, "���̳���");
		
		System.out.println("c1 color-"+c1.color+", auto-"+c1.gearType+", door-"+c1.door+", �׺���̼� ����-"+c1.navigation+", �귣��-"+c1.brand);
		System.out.println("c2 color-"+c2.color+", auto-"+c2.gearType+", door-"+c2.door+", �׺���̼� ����-"+c2.navigation+", �귣��-"+c2.brand);
		Car.what_brand();
	}
}
