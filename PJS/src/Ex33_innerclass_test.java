class AAA{
	int i = 100;
	BBB b = new BBB();
	
	class BBB {
		void method() {
			AAA a = new AAA();
			System.out.println(i);
		}
	}
}



public class Ex33_innerclass_test {

	public static void main(String[] args) {
		AAA a = new AAA();
		a.b.method();
		AAA.BBB b = a.new BBB();
//		AAA.BBB c = AAA().new BBB();
	}
}
