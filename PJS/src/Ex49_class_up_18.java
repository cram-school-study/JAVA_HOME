import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ex49_class_up_18 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tmp;
		
		System.out.println("���� ���?");
		int n = sc.nextInt();
		System.out.println("�������� ����?");
		int k = sc.nextInt();
		
		Queue princes1 = new LinkedList<>();
		for(int i=0; i<n; i++) princes1.offer(i+1);

		while(!princes1.isEmpty()) {
			for(int i=0;i<k-1;i++) {
				princes1.offer(princes1.poll());
			}
			
			System.out.println("���� ���� - " + princes1);
			System.out.println("���� ���� - " + princes1.poll());
			
			if (princes1.size() == 1) {
				System.out.println(princes1);
				break;				
			}

		}
		
		ArrayList princes2 = new ArrayList();
		for(int i=0; i<n; i++) princes2.add(i+1);
		
		while(!princes2.isEmpty()) {
			for(int i=0;i<k-1;i++) {
				princes2.add(princes2.remove(0));
			}
			
			System.out.println("���� ���� - " + princes2);
			System.out.println("���� ���� - " + princes2.remove(0));
			
			if (princes2.size() == 1) {
				System.out.println(princes2);
				break;				
			}
		}
	}
}
