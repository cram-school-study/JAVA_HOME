import java.util.ArrayList;
import java.util.Collections;

public class Ex47_class_Collections01 {

	public static void main(String[] args) {
		ArrayList list1 = new ArrayList(10);
		list1.add(new Integer(5)); //auto boxing 떄문에
		list1.add(new Integer(4));
		list1.add(new Integer(2));
		list1.add(new Integer(0));
		list1.add(new Integer(1));
		list1.add(new Integer(3));
		
		ArrayList list2 = new ArrayList<>(list1.subList(1, 4));
		System.out.println(list1.get(5));
		System.out.println(list1.indexOf(5));
		print(list1, list2);

		
		System.out.println("오름차순으로 정렬하기...");
		Collections.sort(list1);
		Collections.sort(list2);
		print(list1, list2);
		
		System.out.println(list1);
		// 객체의 참조형의 구조 array
		System.out.println(list1.get(new Integer(5))); // unboxing
		System.out.println(list1.get(5));
		System.out.println(list1.indexOf(5));
		System.out.println(list1.size());
		System.out.println(list2.set(1, 4));
		
		System.out.println("내림차순으로 정렬하기...");
		Collections.sort(list1, Collections.reverseOrder());
		Collections.sort(list2, Collections.reverseOrder());
		print(list1, list2);		
		
		System.out.println("리스트 포함여부");
		System.out.println(list1.containsAll(list2));
		System.out.println(list1.containsAll(list1));
		
		list2.add("ABC");
		System.out.println(list1.containsAll(list2));
		print(list1, list2);
		
		for(int i=list2.size()-1; i>=0; i--) {
			if (list1.contains(list2.get(i))) {
				list2.remove(i);
			}
		}
		
		print(list1, list2);
		
		
	}

	
	static void print(ArrayList list1, ArrayList list2) {
		System.out.println("list1 - " + list1);
		System.out.println("list2 - " + list2);
		System.out.println();
		
	}
}
