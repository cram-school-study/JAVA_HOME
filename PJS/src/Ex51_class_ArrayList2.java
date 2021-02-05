import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Ex51_class_ArrayList2 {

	public static void main(String[] args) {
		ArrayList list1 = new ArrayList<>();
		list1.add("1");
		list1.add("2");
		list1.add("3");
		list1.add("4");
		list1.add("5");
		
		System.out.println(list1);
		
		for(int i=0;i<list1.size();i++) System.out.println(list1.get(i));
		
		HashSet list2 = new HashSet();
		list2.add("1");
		list2.add("2");
		list2.add("8");
		list2.add("3");
		list2.add("4");
		list2.add("5");
		// 8이 순서대로 안들어가므로 set은 위치 저장하지않음.
		
		System.out.println(list2);
		
		Iterator iter = list2.iterator();
		while(iter.hasNext()) {
			Object object = iter.next();
			System.out.println(object);
		}
		// iterator를 사용하더라도 숫자정보는 저장되지않기떄문에 그대로 출력
		
		Iterator iter2 = list1.iterator();
		while(iter2.hasNext()) {
			Object obj = iter2.next();
			System.out.println("테스트1 - " +obj);
		}
			
		// listIterator는 list 인스턴스에 구현되어있고, array list부터 사용하므로, array list 이하 클래스들만 사용가능 !
		ListIterator iter3 = list1.listIterator();
		
		
//		for(int i=0;i<list2.size();i++) {
//			Object object = list2.get(i);
//			System.out.println(object);
//		}
		
		
		
	}

}
