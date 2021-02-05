public class Test1 {

	public static void main(String[] args) {
		int x = 1;
		Integer i = 1;
		String b = "";
		Object o;
		double d = 1.2;
		Double d1 = 1.2;
		o = x;
		
		Object obj1 = new Object();
		Object obj2 = new Object();
		
		System.out.println(d1.getClass().getName());
		System.out.println(i.getClass().getName());
		System.out.println(i.getClass());
		
		System.out.println(obj1==obj2);
		System.out.println(obj1.equals(obj2));
	}

}
