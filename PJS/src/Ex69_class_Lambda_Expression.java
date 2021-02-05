@FunctionalInterface
interface MyFunction {
	public abstract int method(int x, int y);
//	public abstract int method2(int x, int y); 
//	FunctionalInterface 어노테이션의 경우 interface에 단 하나의 메소드만 허락
}

interface SingleFunction {
	public abstract int method(int x);
}

interface voidFunction {
	public abstract void method();
}

public class Ex69_class_Lambda_Expression {

	public static void main(String[] args) {
		MyFunction max, sum, mul;
		max = (a,b) -> a > b ? a : b;
		sum = (a,b) -> a+b;
		mul = (a,b) -> a*b;
		
		System.out.println(max.method(4, 7));
		System.out.println(sum.method(4, 7));
		System.out.println(mul.method(4, 7));
		
		SingleFunction squre;
		squre = x -> x*x;
		System.out.println(squre.method(5));
		
		voidFunction message;
		message = () -> System.out.println("void 람다식 출력");

		message.method();
		
	}
}