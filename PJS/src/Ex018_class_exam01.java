class Car1 {
	String color;
	int door;
	
	void drive() {
		System.out.println("운전시작, 부우우웅 ~~~~~~");
	}
	
	void stop() {
		System.out.println("스톱,, 멈춥니다.");
	}
}

class FireEngin extends Car1 {
	void water() {
		System.out.println("물을 뿌립니다.");
	}
}


public class Ex018_class_exam01 {
	public static void main(String[] args) {
		Car1 car1 = null;
		FireEngin fireEngin1 = new FireEngin();
		FireEngin fireEngin2 = null;
		
		fireEngin1.water();
		
		car1 = (Car1)fireEngin1; //(Car) 형변환이 생략 가능, 왜 생략할 수 있냐.. 왼쪽편이 오른쪽편의 조상이기때문
		car1 = fireEngin1; //(Car1) 형변환이 생략 가능, 왜 생략할 수 있냐.. 왼쪽편이 오른쪽편의 조상이기때문
		//car1.water(); 에러 형변환 하면서 날아감
		car1.drive();
		
		fireEngin2 = fireEngin1;
		fireEngin2.water();
		
		fireEngin2 = (FireEngin)car1; // (FireEngin) 형변환이 생략 불가능, 왼쪽이 오른쪽 편의 자손이기 때문
		fireEngin2.water(); // 가능
		
		
	}
}
