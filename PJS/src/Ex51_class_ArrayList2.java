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
		// 8�� ������� �ȵ��Ƿ� set�� ��ġ ������������.
		
		System.out.println(list2);
		
		Iterator iter = list2.iterator();
		while(iter.hasNext()) {
			Object object = iter.next();
			System.out.println(object);
		}
		// iterator�� ����ϴ��� ���������� ��������ʱ⋚���� �״�� ���
		
		Iterator iter2 = list1.iterator();
		while(iter2.hasNext()) {
			Object obj = iter2.next();
			System.out.println("�׽�Ʈ1 - " +obj);
		}
			
		// listIterator�� list �ν��Ͻ��� �����Ǿ��ְ�, array list���� ����ϹǷ�, array list ���� Ŭ�����鸸 ��밡�� !
		ListIterator iter3 = list1.listIterator();
		
		
//		for(int i=0;i<list2.size();i++) {
//			Object object = list2.get(i);
//			System.out.println(object);
//		}
		
		
		
	}

}
