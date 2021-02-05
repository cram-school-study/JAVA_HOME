import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class String_count_sort {

	public static void main(String[] args) {
		String news_arr = ""
				+"Justice Minister Choo Mi-ae on Tuesday suspended Prosecutor General Yoon Seok-youl from his duty, in an unprecedented move amid a feud over prosecution reforms and various investigations involving Yoon's aide and family members."
				+"\"The ministry has been investigating various allegations against the top prosecutor and found out some serious misconduct,\" the justice minister said during a briefing."
				+"As reasons to bar him from his duty and seek disciplinary actions, the minister cited what she called an \"improper\" meeting with a media executive, the illegal inspection of judges involved in controversial cases, interference with the prosecution's investigations to protect people close to him and damage to public trust in the political neutrality of the prosecution. She also cited his alleged leak of information to the press on the Supreme Prosecutors Office's launch of an audit into his close aide involved in an alleged blackmail case."
				+"She said that Yoon violated ethics by meeting with Hong Seok-hyun, chairman of JoongAng Holdings, the media group that owns local daily JoongAng Ilbo and cable channel JTBC, in November 2018, who could be an interested party in a case being probed by prosecutors. Yoon was the chief prosecutor at the Seoul Central District Prosecutors Office at that time. Choo didn't offer further details.";
		
		String[] news = news_arr.split(" ");
		Map<String, Integer> map = new HashMap<String, Integer>();		
		
		for(int i=0; i<news.length; i++) {
			boolean flag = false;
			if (!map.containsKey(news[i])) {
				map.put(news[i], 1);
			}else {
				map.put(news[i], (int)map.get(news[i]) + 1 );
			}
		}
		
		List<Map.Entry<String, Integer>> list = new LinkedList<>(map.entrySet());
//		List<Map.Entry<String, Integer>> list = new LinkedList<>(map.entrySet());
		
		for(Iterator<Map.Entry<String, Integer>> iter = list.iterator(); iter.hasNext();) {
			Map.Entry<String, Integer> entry = iter.next();
			map.put(entry.getKey(), entry.getValue());
		}

		Collections.sort(list, new DescComp());
		System.out.println(list);
	}

}

class DescComp implements Comparator<Map.Entry<String, Integer>> {

	@Override
	public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
		int comparision = (o1.getValue() - o2.getValue()) * -1;
		return comparision == 0? o1.getKey().compareTo(o2.getKey()) : comparision;
	}
	
}
