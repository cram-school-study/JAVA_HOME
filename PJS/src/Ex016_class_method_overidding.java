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
		// 1. �θ� �ڽ� ���� ���� ������ ���� �� �������̵��� �����ʰ� �ڽ� Ŭ�������� �θ��� �޼��带 ����
		// �θ�� �ڽ��� ���� ���� ������ �������ְ�, 
		// �������̵��� ���� �ʾ����ÿ��� �ش� �޼��忡�� ���� �������� ������ �������⶧����
		// �Ǵ��� �򰥸����� ������ �� �˾Ƶ���.  
		
		//2. �θ𿡼� ȣ���ϳ�, �ڽĿ��� ȣ���ϳĿ� ���� �ش� �������� �ٲ� ���ΰ� �ִ�. �� �˾Ƶ���.
		
	}
}
