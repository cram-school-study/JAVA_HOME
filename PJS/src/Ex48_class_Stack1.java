import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Ex48_class_Stack1 {
	public static void main(String[] args) {
		Stack st = new Stack<>();
		// push, pop - �ְ� ���� 
		// peek() - ���� �ֻ�ܿ� �ִ°� ��ȯ
		// Last In First Out - LIFO ����k 
		st.push("0");
		st.push("1");
		st.push("2");
		st.push("3");
		st.push("4");
//		st.add("1");
		
		Queue q = new LinkedList<>();
		// ť�� �������̽��θ� �����Ǿ��ִ�..???
		// offer, poll - �ְ� ����
		// peek() - �ո� �� �� �ִ�.
		// First In First Out - FIFO ����
		
		q.offer("0");
		q.offer("1");
		q.offer("2");
		q.offer("3");
		q.offer("4");
		//st�� ���� �ƴϸ� ��� ���ƶ�
		st.isEmpty();
		while(!st.empty()) {
			// stack�� �� Ȯ�� empty
			// stack�� �� empty????
			System.out.println(st.pop());
		}
		
		System.out.println();
		
		//q�� ���� �ƴϸ� ��� ���ƶ�
		while(!q.isEmpty()) {
			// queue�� �� Ȯ�� isempty
			System.out.println(q.poll());
		}
		
		// stack�� empty, isempty�� ������??
		
	}
}
