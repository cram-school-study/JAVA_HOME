public class Ex36_innerclass_scope3 {
	private int outerIv=0;
	static int outerCv=0;
	
	class IntanceInner {
		int iiv = outerIv;
		int iiv2 = outerCv;
	}
	
	static class StaticInner {
		int siv1 = 100;
//		int siv2 = outerIv; 스테틱 클래스는 외부 클래스의 인스턴스에 접근할 수 없다.
		static int scv = outerCv;
	}
	
	void myMethod() {
		final int lv=5;
		int LV=0;
		
		class LocalInner {
//			lv = lv + 3; // 1.8부터는 상수로 인정하기때문
			int liv = outerIv;
			int liv2 = outerCv;
			int liv3 = lv; //원래는 error인데, jdk1.8부터는 에러가 아님 단, 상수로 인정함
			int liv4 = LV;
		}
		
		LocalInner localInner = new LocalInner();
		System.out.println(localInner.liv3);
	}
	
	public static void main(String[] args) {
		Ex36_innerclass_scope3 scope3 = new Ex36_innerclass_scope3();
		scope3.myMethod();
		
	
	}
}
