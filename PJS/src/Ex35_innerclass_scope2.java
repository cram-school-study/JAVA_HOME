public class Ex35_innerclass_scope2 {
	class InstanceInner {}
	static class StaticInner {}
	
	//�ν��Ͻ���������� ���� ���� ������ �����ϴ�
	InstanceInner iv = new InstanceInner();
	//����ƽ ��������� ���� ���� ������ �����ϴ�
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
		
//		�޼ҵ� ���� ���������� ����� ���� Ŭ������ �ܺο��� ���� �Ҽ� ����.
//		LocalInner lv = new LocalInner(); 
	}
	
	void myMethod() {
		class LocalInner {}
		LocalInner lv = new LocalInner();
	}
}
