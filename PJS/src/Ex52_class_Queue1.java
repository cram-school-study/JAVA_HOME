import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;
import java.util.Scanner;

public class Ex52_class_Queue1 {
	static Queue q = new LinkedList();
	static final int MAX_SIZE = 5; // Queue�� �ִ� 5�������� �����ϰڴ�.

	public static void main(String[] args) {
		System.out.println("help�� �Է��ϸ� ������ �� �� �־��.");

		while (true) {
			System.out.println(">>");
			try {
				Scanner sc = new Scanner(System.in);
				String input = sc.nextLine().trim();

				if ("".equals(input))
					continue;
//				if(input.equals("")) continue;
// input�� null���� ���ý� error!!!
				if (input.equalsIgnoreCase("q")) {
					System.out.println("���α׷��� ���������� �����մϴ�......");
// equalsIgnoreCase - ��ҹ��� q,Q �Ѵ� �ش� if������ �Ÿ��ڴ�.					
					System.exit(0);
					System.out.println("����ǳ� �ȵǳ� Ȯ�θ�");
				} else if (input.equalsIgnoreCase("help")) {
					System.out.println("help -- ���� ����");
					System.out.println("q or Q key -- ���� ����");
					System.out.println("history -- �ֱٿ� �Է��� ��ɾ�" + MAX_SIZE + "�� �����ݴϴ�.");
				} else if (input.equalsIgnoreCase("history")) {
					int i = 0;
					save(input);

					LinkedList tmp = (LinkedList) q;
					ListIterator it = tmp.listIterator();
					while (it.hasNext()) {
						System.out.println(++i + "." + it.next());
					}
				} else {
					save(input);
					System.out.println("input - " + input);
				}
			} catch (Exception e) {
				System.out.println("�Է� ���� �߻�");
			}
		}
	}

	public static void save(String input) {
		if (!"".equals(input))
			q.offer(input);
		if (q.size() > MAX_SIZE)
			q.poll();
//			q.remove();
	}
}
