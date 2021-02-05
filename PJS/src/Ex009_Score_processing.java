import java.util.Scanner;

public class Ex009_Score_processing {
	public static void main(String[] args) {
		String[] name;
		int[][] score;
		int total[];
		int student_number;
		int ranking[];
		
		
		Scanner sc = new Scanner(System.in);
		
		// 처리할 학생의 인원수를 입력받는다.
		do {
			System.out.println("처리할 학생수는=");
			student_number = sc.nextInt();
		}while( student_number < 1 || student_number > 20 );
		
		System.out.println(student_number+"명의 국어,영어,수학 점수를 입력하세요.");
		
		
		name = new String[student_number];
		score = new int[student_number][3];
		total = new int[student_number];
		ranking = new int[student_number];
		
		String[] subjects = {"국어", "영어", "수학"};
		
		for(int i=0; i<student_number; i++) {
			System.out.println("이름=>");
			name[i] = sc.next();
			
			for(int j=0; j<subjects.length; j++) {
				System.out.println(subjects[j]+"=>");
				score[i][j] = sc.nextInt();
				total[i] += score[i][j];
			}
			System.out.println();
		}
		
		// 랭킹 구하는 부분은 외우십쇼!
		for(int i=0; i<student_number; i++) {
			ranking[i] = 1;
		}
		
		for(int i=0; i<student_number-1; i++) {
			for(int j=i; j<student_number; j++) {
				if(total[i] > total[j]) ranking[j]++;
				else if(total[i] < total[j]) ranking[i]++;
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
