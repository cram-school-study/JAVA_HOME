import java.util.Objects;

class Value {
	int value;
	
	Value(int value) {
		this.value = value;
	}
	
//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + value;
//		return result;
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Value other = (Value) obj;
//		if (value != other.value)
//			return false;
//		return true;
//	}
	
////	최상위 클래스 Object 클래스의 equals를 오버라이딩 
//	public boolean equals(Object obj) {
//		Value v = (Value)obj;
//		return this.value == v.value;
//	}
	
	
//	public boolean equals(Object obj) {
//		if( ! (obj instanceof Value)) return false;
//		Value v = (Value)obj;
//		return this.value == v.value;
//	}
//	
//	public int hashCode() {
//		return Objects.hash(value);
//	}
}

public class Ex40_class_ObjectMethod {
	public static void main(String[] args) {
		Object obj1 = new Object();
		Object obj2 = new Object();
		
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
		System.out.println(obj1==obj2);
		System.out.println();
		
		String str1 = "abc";
		String str2 = "abc";
		String str3 = new String("abc");
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(str3.hashCode());
		if (str1 == str2) {
			System.out.println("1");
		}
		System.out.println();
		
		Value v1 = new Value(10);
		Value v2 = new Value(10);
//		v2 = v1;
		
		
		System.out.println(v1.hashCode());
		System.out.println(v2.hashCode());
		if(v1.equals(v2)) {
			System.out.println("2");
		}
		System.out.println();
		
		v2 = new Value(10);
		
		if(v1.equals(v2)) System.out.println("3");
		
	}
}
