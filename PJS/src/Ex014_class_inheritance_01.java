class Point {
	int x;
	int y;
	
	Point() {}
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

// 상속 관계
class Circle1 extends Point {
	int r;
	
	Circle1 () {}
	Circle1 (int x, int y, int r) {
		super(x,y);
//		super - 부모 생성자
//		this.x = x;
//		this.y = y; 
		this.r = r;
	} 
}

// 포함 관계
class Circle2 {
	Point point = new Point();
	int r;
}


public class Ex014_class_inheritance_01 {

	public static void main(String[] args) {
		Circle1 circle1_1 = new Circle1();
		Circle1 circle1_2 = new Circle1();
		Circle2 circle2_1 = new Circle2();

		circle1_1.x = 10;
		circle1_1.y = 10;
		circle1_1.r = 10;
		
		circle2_1.point.x = 10;
		circle2_1.point.y = 10;
		circle2_1.r = 10;

		System.out.println("circle.x - "+circle1_1.x);
		System.out.println("circle.y - "+circle1_1.y);
		System.out.println("circle.r - "+circle1_1.r);
				
		System.out.println("circle.x - "+circle2_1.point.x);
		System.out.println("circle.y - "+circle2_1.point.y);
		System.out.println("circle.r - "+circle2_1.r);
	}
}
