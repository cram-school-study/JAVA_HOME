import java.util.Scanner;
import java.util.TreeMap;

public class Ex53_class_Hashmap {

	public static void main(String[] args) {
		TreeMap map = new TreeMap();
		map.put("John", "john1234");
		map.put("Paul", "john1234");
		map.put("Terminator", "mc1-0b");
		map.put("Terminator", "T10");
		map.put("Abc", "abcmart");
		map.put("Pensoo", "ebs1234");

		System.out.println(map);
		System.out.println(map.keySet()); // 키의 목록만 표출
		System.out.println(map.values()); // value 목록만 표출
		System.out.println(map.entrySet()); // item 목록만 표출
		
		map.remove("Paul");
		System.out.println(map);
		
		
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("ID와 PASSWORD 입력 : ");
			System.out.println("ID : ");
			String id = scanner.nextLine().strip();
			System.out.println("PW : ");
			String pw = scanner.nextLine();
			
			if( !map.containsKey(id) ) {
				System.out.println("id가 없습니다. 다시 입력해주세요");
				continue;
			}
			
			if( !(map.get(id)).equals(pw) ) {
				System.out.println("pw가 일치하지 않습니다. 다시 입력해주세요");
				continue;
			}else {
				System.out.println("로그인 성공!");
				break;
			}
		}
	}

}
