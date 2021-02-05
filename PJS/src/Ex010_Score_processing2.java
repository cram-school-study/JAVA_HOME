import java.util.Scanner;

public class Ex010_Score_processing2 {
	public static void main(String[] args) {
		// ���� �Լ� Ȱ��
		// ���� - 50<= ~ <= 100
		// �̸� - 1,2,3,4 ...
		String[] name;
		int[][] score;
		int total[];
		int student_number;
		int ranking[];
			
		Scanner sc = new Scanner(System.in);
		
		// ó���� �л��� �ο����� �Է¹޴´�.
		do {
			System.out.println("ó���� �л�����(1~49) =");
			student_number = sc.nextInt();
		}while( student_number < 1 || student_number > 50 );
		
		String[] subjects = {"����", "����", "����"};
		name = new String[student_number];
		score = new int[student_number][subjects.length];
		total = new int[student_number];
		ranking = new int[student_number];
		
		
		for(int i=0; i<student_number; i++) {
			name[i] = (i+1)+"";
			for(int j=0; j<subjects.length; j++) {
				score[i][j] = (int)(Math.random()*51)+50;
				total[i] += score[i][j];
			}
		}
		
		for(int i=0; i<student_number; i++) {
			ranking[i] = 1;
		}
		
		for(int i=0; i<student_number-1; i++) {
			for(int j=i; j<student_number; j++) {
				if(total[i] < total[j]) ranking[i]++;
				else if(total[i] > total[j]) ranking[j]++;
			}
		}
		
		String menuString = "�̸�\t";
		for(int i=0; i<subjects.length; i++) {
			menuString += subjects[i]+"\t"; 
		}
		menuString += "��Ż\t";
		menuString += "���\t";
		menuString += "����\t";
		System.out.println(menuString);
		
		for(int i=0; i<student_number; i++) {
			System.out.print(name[i]+"\t");
			for(int j=0; j<score[i].length; j++) {
				System.out.printf("%d\t", score[i][j]);
			}
			System.out.printf("%d\t", total[i]);
			System.out.printf("%4.2f\t", (float)total[i]/subjects.length);
			System.out.printf("%d\t", ranking[i]);
			
			
			System.out.println();
		}
	}
}
