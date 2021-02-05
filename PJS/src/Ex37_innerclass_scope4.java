class Outer2 {
	class InstanceInner {
		int iv = 100;
	}
	
	static class StaticInner {
		int iv = 200;
		static int cv = 300;
	}
	
	int myMethod() {
		class LocalInner {
			int iv = 400;
			
		}
		
		LocalInner lInner = new LocalInner();
		return lInner.iv;
	}
}

public class Ex37_innerclass_scope4 {
	public static void main(String[] args) {
		Outer2 oc = new Outer2();
		Outer2.InstanceInner ii = oc.new InstanceInner();
		
		System.out.println(ii.iv);
		System.out.println(Outer2.StaticInner.cv);
		
		Outer2.StaticInner si = new Outer2.StaticInner();
		System.out.println(si.iv);
		
		int tmp = oc.myMethod();
		System.out.println(tmp);
	}
}
