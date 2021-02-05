import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public class taster {

	public static void taster(String[] order) {
		HashMap map = new HashMap();
		for(int i=0; i<order.length; i++) {
			String[] split_String = order[i].split(" ");
				
			if (map.get(split_String[0]) == null) {
				Set<String> temp = new HashSet();
				for(int j=1; j<split_String.length; j++) {
					temp.add(split_String[j]);
				}
				map.put(split_String[0], temp);
			}else {
				Set<String> temp_set = (HashSet<String>)map.get(split_String[0]);
				for(int j=1; j<split_String.length; j++) {
					temp_set.add(split_String[j]);
				}
			}
		}
		
	
		Iterator<String> iterator = map.keySet().iterator();
		while( iterator.hasNext() ) {
			String key = iterator.next();
			map.put(key, ((HashSet)map.get(key)).size());
		}
		List<Entry<String, Integer>> list_result = new ArrayList<Entry<String, Integer>>(map.entrySet());
		Collections.sort(list_result , new Comparator<Entry<String, Integer>>() {
			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				return o2.getValue().compareTo(o1.getValue());
			}
			
		});
		
		for(Entry<String, Integer> entry : list_result ) {
			System.out.println(entry.getKey() + "," + entry.getValue());
		}
		
		
	}
	
	public static void main(String[] args) {
		ArrayList<String> order1 = new ArrayList<>();
		order1.add("alex pizza pasta");
		order1.add("bob noodle sandwich pasta");
		order1.add("bob pasta");
		order1.add("alex noodle");
		order1.add("bob steak noodle");

		String[] order2_temp = {"alex pizza pasta steak", "bob noodle sandwich pasta", "choi pizza sandwich pizza", "alex pizza pasta steak"};

		taster(order2_temp);
	}
	

}
