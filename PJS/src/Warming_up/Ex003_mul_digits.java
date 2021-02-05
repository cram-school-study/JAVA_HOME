package Warming_up;
import java.util.Scanner;

public class Ex003_mul_digits {
	public static void main(String[] args) {
		// 숫자를 입력 받아 각각 mul_digits(data) 함수를 만드시오.
		// 각 단위의 숫자를 곱해서 출력을 하시오
		// 단 0은 곱하지 않습니다.
		// 예) 1234 -> 1*2*3*4 = 24
		// 예) 1000 -> 1
		
		int number;
		String parse_number;
		
		System.out.println("숫자를 입력하세요:");
		Scanner sc = new Scanner(System.in);
		number = sc.nextInt();
	
		System.out.println("String - " + mul_digits_String(number));		
		System.out.println("Int - " + mul_digits_int(number));		
	}
	
	public static int mul_digits_String(int data) {
//		1) String을 하나씩 잘라서 사용
		int result = 1;
		String parser_data = data + "";
		
		for(int i=0; i<parser_data.length();i++) {
			if(parser_data.charAt(i) != '0') result *= (parser_data.charAt(i) - 48);
		}
		return result;
	}
	
	public static int mul_digits_int(int data) {
//		2) int형태로 받은 후 10씩 나눠서 사용
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
