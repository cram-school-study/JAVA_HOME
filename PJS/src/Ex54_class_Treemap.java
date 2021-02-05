import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Ex54_class_Treemap {

	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("John", "john1234");
		map.put("Paul", "john1234");
		map.put("Terminator", "mc1-0b");
		map.put("Terminator", "T10");

		System.out.println(map);
		System.out.println(map.keySet()); // Ű�� ��ϸ� ǥ��
		System.out.println(map.values()); // value ��ϸ� ǥ��
		System.out.println(map.entrySet()); // item ��ϸ� ǥ��
		
		map.remove("Paul");
		System.out.println(map);
		
		
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("ID�� PASSWORD �Է� : ");
			System.out.println("ID : ");
			String id = scanner.nextLine().strip();
			System.out.println("PW : ");
			String pw = scanner.nextLine();
			
			if( !map.containsKey(id) ) {
				System.out.println("id�� �����ϴ�. �ٽ� �Է����ּ���");
				continue;
			}
			
			if( !(map.get(id)).equals(pw) ) {
				System.out.println("pw�� ��ġ���� �ʽ��ϴ�. �ٽ� �Է����ּ���");
				continue;
			}else {
				System.out.println("�α��� ����!");
				break;
			}
		}
	}

}
