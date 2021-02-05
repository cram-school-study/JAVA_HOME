import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Ex72_class_FunctionPackage3 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i=0; i<10; i++) {
			list.add(i);
		}
		
		list.forEach(i->System.out.print(i+","));
		// ���ιݺ��� - ��Ƽ������ ���� - �䷯���� ����?
		System.out.println();
		System.out.println(list);
		
		Iterator<Integer> it = list.iterator();
		// �ܺιݺ��� 
		while(it.hasNext()) {
			System.out.print(it.next() + ",");
		}
		System.out.println();
		
		list.removeIf(xx -> xx%2==0 || xx%3==0 );
		System.out.println(list);
		
		System.out.println();
		Map<String, String> map = new HashMap<String, String>();
		map.put("������1", "010-1234-5678");
		map.put("������2", "010-1111-1111");
		map.put("������3", "010-9999-9999");
		
		map.forEach((k, v) -> System.out.println("key - " + k +", value - " + v));
		System.out.println();
		
		Iterator<String> it1 = map.keySet().iterator();
		while(it1.hasNext()) {
			String key = it1.next();
			System.out.print("key - " + key +", value - " + map.get(key));
			System.out.println();
		}
	
	}
}

















