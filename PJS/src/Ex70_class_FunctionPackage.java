import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Ex70_class_FunctionPackage {

	public static void main(String[] args) {
		Supplier<Integer> s = () -> (int)(Math.random() * 100) + 1;
		Consumer<Integer> c = i -> System.out.print(i + " ");
		Predicate<Integer> p = i -> i%2 == 0;
		Function<Integer, Integer> f = i -> i/10*10; // 단 단위 제거
		
		for(int i=0; i<10; i++) System.out.print(s.get() + " ");
		System.out.println();
		for(int i=0; i<10; i++) c.accept(i);
		System.out.println();
		for(int i=0; i<10; i++) System.out.print(p.test(i) + " ");
		System.out.println();
		System.out.println(f.apply(83));
		
		List<Integer> list1 = new ArrayList<Integer>();
		markRandomList(s, list1);
		System.out.println(list1);
		
		printEvenNum(p, c, list1);
	}
	
	static <T> void markRandomList(Supplier<T> s, List<T> list) {
		for(int i=0; i<10; i++) {
			list.add(s.get());
		}
	}

	static <T> void printEvenNum(Predicate<T> p, Consumer<T> c, List<T> list) {
		System.out.println();
		for(T i: list) {
			if (p.test(i)) {
				c.accept(i);
			}
		}
		System.out.println();
	}
}

















