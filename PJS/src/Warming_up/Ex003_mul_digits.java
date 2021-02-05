package Warming_up;
import java.util.Scanner;

public class Ex003_mul_digits {
	public static void main(String[] args) {
		// ���ڸ� �Է� �޾� ���� mul_digits(data) �Լ��� ����ÿ�.
		// �� ������ ���ڸ� ���ؼ� ����� �Ͻÿ�
		// �� 0�� ������ �ʽ��ϴ�.
		// ��) 1234 -> 1*2*3*4 = 24
		// ��) 1000 -> 1
		
		int number;
		String parse_number;
		
		System.out.println("���ڸ� �Է��ϼ���:");
		Scanner sc = new Scanner(System.in);
		number = sc.nextInt();
	
		System.out.println("String - " + mul_digits_String(number));		
		System.out.println("Int - " + mul_digits_int(number));		
	}
	
	public static int mul_digits_String(int data) {
//		1) String�� �ϳ��� �߶� ���
		int result = 1;
		String parser_data = data + "";
		
		for(int i=0; i<parser_data.length();i++) {
			if(parser_data.charAt(i) != '0') result *= (parser_data.charAt(i) - 48);
		}
		return result;
	}
	
	public static int mul_digits_int(int data) {
//		2) int���·� ���� �� 10�� ������ ���
		int result = 1;
		
		while(true) {
			if(data / 10 == 0) {
				result *= (data % 10);
				break;
			}else if(data % 10 == 0) ;
			else result *= (data % 10);
			data = data/10;
		}
		return result;
	}
}
