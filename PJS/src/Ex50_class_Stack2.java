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
				System.out.println("������ ��ȣ�� ��Ȯ�մϴ�.");
			}else {
				
				// ��� ��ȣ�� ���������� (�� ��ȣ�� �� ������) 
				System.out.println("������ ��ȣ�� ����Ȯ �մϴ�.");
			}
			// �� �������ҋ�(�� ��ȣ�� �� ������)
		} catch(EmptyStackException e) {
			System.out.println("##������ ��ȣ�� ����Ȯ �մϴ�.##");
		}
	}

}
