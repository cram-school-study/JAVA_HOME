import java.util.EmptyStackException;
import java.util.Stack;

public class Ex50_class_Stack2 {

	public static void main(String[] args) {
		Stack st = new Stack<>();
		String expression = "((((3+8)*24/(4+8))";
		
		System.out.println("expression: " + expression);
		
		try {
			for(int i = 0; i < expression.length(); i++) {
				char ch = expression.charAt(i);
				
				if( ch == '(' ) st.push(ch+"");
				else if(ch == ')') st.pop();
			}
			
			if(st.isEmpty()) {
				System.out.println("수식의 괄호가 정확합니다.");
			}else {
				
				// 결과 괄호가 남아있을때 (앞 괄호가 더 많을떄) 
				System.out.println("수식의 괄호가 부정확 합니다.");
			}
			// 더 빼려고할떄(뒤 괄호가 더 많을떄)
		} catch(EmptyStackException e) {
			System.out.println("##수식의 괄호가 부정확 합니다.##");
		}
	}

}
