public class Ex36_innerclass_scope3 {
	private int outerIv=0;
	static int outerCv=0;
	
	class IntanceInner {
		int iiv = outerIv;
		int iiv2 = outerCv;
	}
	
	static class StaticInner {
		int siv1 = 100;
//		int siv2 = outerIv; ����ƽ Ŭ������ �ܺ� Ŭ������ �ν��Ͻ��� ������ �� ����.
		static int scv = outerCv;
	}
	
	void myMethod() {
		final int lv=5;
		int LV=0;
		
		class LocalInner {
//			lv = lv + 3; // 1.8���ʹ� ����� �����ϱ⶧��
			int liv = outerIv;
			int liv2 = outerCv;
			int liv3 = lv; //������ error�ε�, jdk1.8���ʹ� ������ �ƴ� ��, ����� ������
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
