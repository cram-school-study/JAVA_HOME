import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;
import java.util.Scanner;

public class Ex52_class_Queue1 {
	static Queue q = new LinkedList();
	static final int MAX_SIZE = 5; // Queue에 최대 5개까지만 저장하겠다.

	public static void main(String[] args) {
		System.out.println("help를 입력하면 도움말을 볼 수 있어요.");

		while (true) {
			System.out.println(">>");
			try {
				Scanner sc = new Scanner(System.in);
				String input = sc.nextLine().trim();

				if ("".equals(input))
					continue;
//				if(input.equals("")) continue;
// input에 null값이 들어올시 error!!!
				if (input.equalsIgnoreCase("q")) {
					System.out.println("프로그램을 정상적으로 종료합니다......");
// equalsIgnoreCase - 대소문자 q,Q 둘다 해당 if문으로 거르겠다.					
					System.exit(0);
					System.out.println("실행되나 안되나 확인만");
				} else if (input.equalsIgnoreCase("help")) {
					System.out.println("help -- 도움말 실행");
					System.out.println("q or Q key -- 실행 종료");
					System.out.println("history -- 최근에 입력한 명령어" + MAX_SIZE + "개 보여줍니다.");
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
				System.out.println("입력 오류 발생");
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
