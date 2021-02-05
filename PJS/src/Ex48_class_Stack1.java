import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Ex48_class_Stack1 {
	public static void main(String[] args) {
		Stack st = new Stack<>();
		// push, pop - 넣고 뺴기 
		// peek() - 제일 최상단에 있는것 반환
		// Last In First Out - LIFO 구조k 
		st.push("0");
		st.push("1");
		st.push("2");
		st.push("3");
		st.push("4");
//		st.add("1");
		
		Queue q = new LinkedList<>();
		// 큐는 인터페이스로만 구현되어있다..???
		// offer, poll - 넣고 빼기
		// peek() - 앞만 볼 수 있다.
		// First In First Out - FIFO 구조
		
		q.offer("0");
		q.offer("1");
		q.offer("2");
		q.offer("3");
		q.offer("4");
		//st가 빈값이 아니면 계속 돌아라
		st.isEmpty();
		while(!st.empty()) {
			// stack는 빈값 확인 empty
			// stack는 왜 empty????
			System.out.println(st.pop());
		}
		
		System.out.println();
		
		//q가 빈값이 아니면 계속 돌아라
		while(!q.isEmpty()) {
			// queue는 빈값 확인 isempty
			System.out.println(q.poll());
		}
		
		// stack와 empty, isempty의 차이점??
		
	}
}
