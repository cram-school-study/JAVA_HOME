public class Ex35_innerclass_scope2 {
	class InstanceInner {}
	static class StaticInner {}
	
	//인스턴스멤버간에는 서로 직접 접근이 가능하다
	InstanceInner iv = new InstanceInner();
	//스테틱 멤버간에는 서로 직접 접근이 가능하다
	StaticInner cv = new StaticInner();
	
	static void staticMethod() {
//		InstanceInner obj8 = new InstanceInner();
		StaticInner obj2 = new StaticInner();
		
		Ex35_innerclass_scope2 outer = new Ex35_innerclass_scope2();
		InstanceInner obj1 = outer.new InstanceInner();
	}
	
	void instanceMethod() {
		InstanceInner obj3 = new InstanceInner();
		StaticInner obj4 = new StaticInner();
		
//		메소드 내에 지역적으로 선언된 내부 클래스는 외부에서 접근 할수 없다.
//		LocalInner lv = new LocalInner(); 
	}
	
	void myMethod() {
		class LocalInner {}
		LocalInner lv = new LocalInner();
	}
}
