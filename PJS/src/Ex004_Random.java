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
		
		System.out.println("1~100 ���� ���߱� ����! ��&�ٿ�");
		
		while(true) {
			count++;
			System.out.println("���ڸ� �Է��ϼ��� :");
			input_number = scanner.nextInt();
			
			if (input_number == random_number) {
				System.out.printf("�����Դϴ�! %d������ Ż���ϼ̽��ϴ�!\n", count);
				break;
			}else if (input_number > random_number) {
				if(input_number > max) {
					System.out.printf("�����Դϴ�! %d�� Ʋ���̽��ϴ�. ������ ���� �ʴ� �����Դϴ�. ���ڸ� �Է��ϼ���!\n", count);
				}else {
					max = input_number;
					System.out.printf("�����Դϴ�! %d�� Ʋ���̽��ϴ�. ���� - %d < ���� < %d ���ڸ� �Է��ϼ���!\n", count, min, max);					
				}
			}else {
				if (input_number < min) {
					System.out.printf("�����Դϴ�! %d�� Ʋ���̽��ϴ�. ������ ���� �ʴ� �����Դϴ�. ���ڸ� �Է��ϼ���!\n", count);
				}else {
					min = input_number;
					System.out.printf("�����Դϴ�! %d�� Ʋ���̽��ϴ�. ���� - %d < ���� < %d ���ڸ� �Է��ϼ���!\n", count, min, max);	
				}
			}
		}
	}
}
