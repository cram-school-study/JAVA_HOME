import java.util.Random;
import java.util.Scanner;

public class Ex004_Random {
	public static void main(String[] args) {
		double random_number = (int)(Math.random()*100)+1;
		int input_number;
		int count = 0;
		int max = 100;
		int min = 0;
		Scanner scanner = new Scanner(System.in); 
		
		System.out.println("1~100 숫자 맞추기 게임! 업&다운");
		
		while(true) {
			count++;
			System.out.println("숫자를 입력하세요 :");
			input_number = scanner.nextInt();
			
			if (input_number == random_number) {
				System.out.printf("정답입니다! %d번만에 탈출하셨습니다!\n", count);
				break;
			}else if (input_number > random_number) {
				if(input_number > max) {
					System.out.printf("오답입니다! %d번 틀리셨습니다. 범위에 맞지 않는 숫자입니다. 숫자를 입력하세요!\n", count);
				}else {
					max = input_number;
					System.out.printf("오답입니다! %d번 틀리셨습니다. 범위 - %d < 정답 < %d 숫자를 입력하세요!\n", count, min, max);					
				}
			}else {
				if (input_number < min) {
					System.out.printf("오답입니다! %d번 틀리셨습니다. 범위에 맞지 않는 숫자입니다. 숫자를 입력하세요!\n", count);
				}else {
					min = input_number;
					System.out.printf("오답입니다! %d번 틀리셨습니다. 범위 - %d < 정답 < %d 숫자를 입력하세요!\n", count, min, max);	
				}
			}
		}
	}
}
