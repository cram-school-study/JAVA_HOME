public class Ex34_innerclass_scope {
	class InstanceInner{
		int iv=100;
//		static int cv=100; static 클래스가 아니라 에러
		final static int CONST = 100;
	}
	
	static class StaticInner {
		int iv = 200;
		static int cv = 200;
	}
	
	void myMethod() {
		class LocalInner {
			int iv = 300;
//			static int cv = 300; static 변수 선언 불가
			final static int CONST = 300;
		} 
	}
	
	public static void main(String[] args) {
		System.out.println(InstanceInner.CONST);
		System.out.println(StaticInner.cv);
	}
}
