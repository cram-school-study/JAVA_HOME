class Parent {
	int x=1;
	int y=2;
	
	Parent() {
		this(2,2);
	}
	Parent(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void message() {
		System.out.println("x="+x+",y="+y);
	}
}

class Son extends Parent{
	int i=10;
	int y=20;
	
	Son() {
		super(3,3);
		this.i = 100;
	}
	public void message1() {
		System.out.println("x="+x+",y="+y+",i="+i);
	}
}


public class Ex016_class_method_overidding {
	public static void main(String[] args) {
		Son son = new Son();
		son.message();
		son.message1();
		// 1. 부모 자식 같은 명의 변수를 가진 후 오버라이딩을 하지않고 자식 클래스에서 부모의 메서드를 실행
		// 부모와 자식이 같은 명의 변수를 가지고있고, 
		// 오버라이딩을 하지 않았을시에는 해당 메서드에서 가장 가까운곳의 변수를 가져오기때문에
		// 판단이 헷갈릴수도 있으니 잘 알아두자.  
		
		//2. 부모에서 호출하냐, 자식에서 호출하냐에 따라서 해당 변수값이 바뀔 여부가 있다. 잘 알아두자.
		
	}
}
