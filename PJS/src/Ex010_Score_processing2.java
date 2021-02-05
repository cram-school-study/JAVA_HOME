import java.util.Scanner;

public class Ex010_Score_processing2 {
	public static void main(String[] args) {
		// 랜덤 함수 활용
		// 점수 - 50<= ~ <= 100
		// 이름 - 1,2,3,4 ...
		String[] name;
		int[][] score;
		int total[];
		int student_number;
		int ranking[];
			
		Scanner sc = new Scanner(System.in);
		
		// 처리할 학생의 인원수를 입력받는다.
		do {
			System.out.println("처리할 학생수는(1~49) =");
			student_number = sc.nextInt();
		}while( student_number < 1 || student_number > 50 );
		
		String[] subjects = {"국어", "영어", "수학"};
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
		
		String menuString = "이름\t";
		for(int i=0; i<subjects.length; i++) {
			menuString += subjects[i]+"\t"; 
		}
		menuString += "토탈\t";
		menuString += "평균\t";
		menuString += "순위\t";
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
