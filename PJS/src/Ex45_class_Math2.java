public class Ex45_class_Math2 {
	public static void main(String[] args) {
		int i = new Integer(100);
		int i1 = new Integer(101).intValue();
		int i2 = Integer.parseInt("100");
		int i3 = Integer.parseInt("100" , 2);
		Integer iObj = new Integer(7);
		
		try {
			System.out.println(i);
			System.out.println(i1);
			System.out.println(i2);
			System.out.println(i3);
			System.out.println(iObj);
			System.out.println(Integer.parseInt("100",10));
			System.out.println(Integer.parseInt("FF",16));
			System.out.println(Integer.parseInt("77",8));
		} catch(Exception e) {
			System.out.println("format ¹ß»ý..");
		}
		
		
	}
}
